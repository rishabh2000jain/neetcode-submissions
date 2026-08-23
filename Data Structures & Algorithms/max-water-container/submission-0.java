class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int st = 0,en=heights.length-1;
        

        while(st<en){
            int h1 = heights[st];
            int h2 = heights[en];
            int minTower = Math.min(h1,h2);
            int gaps = en-st;
            int currAns = minTower * gaps;
            ans = Math.max(ans,currAns);
            if(h1 > h2){
                en--;
            }else if(h1 < h2){
                st++;
            }else{
                st++;
                en--;
            }
        }

        return ans;
    }
}
