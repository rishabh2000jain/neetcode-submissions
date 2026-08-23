class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }
        Arrays.sort(nums);
        int ans = 1;
        int currAns = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1 == nums[i] || nums[i-1] == nums[i]){
                if(nums[i-1] == nums[i]){
                    continue;
                }
                currAns++;
            }else{
                ans = Math.max(currAns,ans);
                currAns = 1;
            }
        }
        return Math.max(currAns,ans);
    }
}
