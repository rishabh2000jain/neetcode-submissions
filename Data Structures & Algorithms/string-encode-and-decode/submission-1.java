class Solution {
   
  

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()+"");
            sb.append("/");
            sb.append(strs.get(i));
        }
         System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        int strLen = 0;
        while(i < str.length()){
            char ch = str.charAt(i);
            System.out.println(i);
            if(ch != '/'){
                int num = (int) ch-'0';
                strLen = (strLen * 10)+num;
                i++;
            }else{
                ans.add(str.substring(i+1,i+1+strLen));
                i += (strLen+1);
                strLen = 0;
            }
        }
        return ans;
    }
}

