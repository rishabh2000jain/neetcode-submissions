class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int p1 = 0, p2 = 0;
        int n = nums.length;
        while(p1 < n && p2 < n){
            if(nums[p1] == val){
                if(nums[p2] != val){
                    nums[p1++] = nums[p2];
                }
                nums[p2++] = -1;
            }else if(nums[p1] == -1){
                if(nums[p2]!=val){
                    nums[p1++] = nums[p2];
                }
                nums[p2++] = -1;
            }else{
                p1++; 
            }
            if(p1 > p2) p2 = p1+1;
        }
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
            if(nums[i] != -1){
                k++;
            }else{
                return k;
            }
        }
        return k;
    }
}