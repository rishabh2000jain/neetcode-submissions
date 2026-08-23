class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 1){
            return strs[0];
        }
        String ans = "";
        int index=0;
        int charIndex=0;
        Character ch = null;
        while(true){
            if(index >= n || strs[index].length() <= charIndex){
                break;
            }
            if(ch == null){
                ch = strs[index].charAt(charIndex);  
            }
            if(ch != strs[index].charAt(charIndex)){
               break;
            }
            index = (index+1)%n;
            if(index == 0){
                ans += ""+ch;
                charIndex++;
                ch=null;
            }
        }

        return ans;
    }
}