class Solution {
    public int trap(int[] height) {
        int lm=height[0];
        int rm=height[height.length-1];
        int l=0,r=height.length-1,water=0;
        while(l<r){
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            if(lm<rm){
                water+=lm-height[l];
                l++;
            }
            else{
                water+=rm-height[r];
                r--;
            }
        }
        return water;
    }
}