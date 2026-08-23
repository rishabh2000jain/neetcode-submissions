class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append("-");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.print(str);
        List<String> ans = new ArrayList<>();
        int index = 0;
    
        while(index < str.length()){
            int lenEnd = index;
            while(str.charAt(lenEnd) != '-'){
                lenEnd++;
            }

            int wordLen =  Integer.parseInt(str.substring(index,lenEnd));
            index = lenEnd+1;
            System.out.println(index);
            ans.add(str.substring(index,index+wordLen));
            index = index+wordLen;
        }
        return ans;
    }
}

//Input: ["neet","code","love","you"]

//i = 15
//4neet 4code 4love 3you