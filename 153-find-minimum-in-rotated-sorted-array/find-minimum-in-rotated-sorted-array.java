class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int mid=0;
        int l=0,r=nums.length-1;
        while(l<=r){
            mid=l+(r-l)/2;
            min=Math.min(min,nums[mid]);
            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid+1]);
                r=mid-1;
            }
        }
        return min;
    }
}