class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0;
        while(l<=r && r<nums.length){
            if(nums[r]!=0){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        for(int i=l;i<nums.length;i++){
            nums[i]=0;
        }
    }
}