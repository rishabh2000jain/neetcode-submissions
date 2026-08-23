class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }
        int currAns = 1;
        int ans = 1;

        List<Integer> seqSt = new ArrayList<>();
        Set<Integer> numsSet = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            numsSet.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!numsSet.contains(nums[i]-1)){
                seqSt.add(nums[i]);
            }
        }

        for(int i=0;i<seqSt.size();i++){
            int stNum = seqSt.get(i)+1;
            for(int sq=stNum;sq <=1000;sq++){
                if(!numsSet.contains(sq)){
                    break;
                }
                currAns+=1;
            }
            ans = Math.max(currAns,ans); 
            currAns = 1;  
        }

        return Math.max(currAns,ans);
    }
}
