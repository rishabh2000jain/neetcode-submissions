class Solution {
    public int majorityElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int p1 = 0, p2 = 1;
        int n = nums.length;

        while(p1 < n && p2 < n){
            if(nums[p1] != nums[p2]){
                nums[p1] = ans;
                nums[p2] = ans;
                p1 = p2+1;
                p2 = p1+1;
            }else{
                p1++;
                p2++;
            }
        }
        for(int i=0;i<n;i++){
            if(ans != nums[i]) return nums[i];
        }
        return ans;
    }
}