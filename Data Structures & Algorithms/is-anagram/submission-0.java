class Solution {
    public boolean isAnagram(String s, String t) {
        int count[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        int size = s.length();
        for(int i=0;i<size;i++){
            count[getIndex(s.charAt(i))]++;
            count[getIndex(t.charAt(i))]--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
    int getIndex(char ch){
        int index = (int)ch-'a';
        
        return index;
    }
}
