class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s:strs){
            sb.append(s.length());
            sb.append("/");
            sb.append(s);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        for(int i=0;i<str.length();){
            int len = 0;
            while(str.charAt(i)!='/'){
                int ch = (int)(str.charAt(i) - '0');
                len = (len*10)+ch;
                i++;
            }
            i++;
           
            ans.add(str.substring(i,i+len));
            i = i+len;
        }

        return ans;
    }
}
