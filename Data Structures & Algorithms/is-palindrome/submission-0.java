class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i < j){
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(j));
            if(!isValidChar(c1)){
                i++;
            }else if(!isValidChar(c2)){
                j--;
            }else if(c1!=c2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    boolean isValidChar(char ch){
        return (ch >= 'a' && ch <='z') || (ch >= '0' && ch <='9');
    }
}
