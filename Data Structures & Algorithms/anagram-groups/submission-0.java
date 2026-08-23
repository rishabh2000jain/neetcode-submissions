class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<Integer>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String key = sortString(strs[i]);
            List<Integer> indexes = map.getOrDefault(key,new ArrayList<Integer>());
            indexes.add(i);
            map.put(key,indexes); 
        }

        for(Map.Entry<String,List<Integer>> entry: map.entrySet()){
            List<String> sub = new ArrayList<>();
            List<Integer> indexes = entry.getValue();
            for(int pos=0;pos<indexes.size();pos++){
                sub.add(strs[indexes.get(pos)]);
            }
            ans.add(sub);
        }

        return ans;
    }

    String sortString(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
class Pair{
    int index;
    int count;

    Pair(int i){
        index = i;
        count = 1;
    }

    void increase(){
        count++;
    }

}
