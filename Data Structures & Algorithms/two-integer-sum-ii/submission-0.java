class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[] = new int[2];
        int st = 0,en=numbers.length-1;
        while(st<en){
            int sum = numbers[st]+numbers[en];
            if(sum > target){
                en--;
            }else if(sum < target){
                st++;
            }else{
                break;
            }
        }
        ans[0]=st+1;
        ans[1]=en+1;
        return ans;
    }
}
