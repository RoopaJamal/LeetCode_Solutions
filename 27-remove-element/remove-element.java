class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0 || (nums.length==1 && val==nums[0]) ) return 0;
        if(nums.length==1 && val!=nums[0]) return 1;
        int k=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[k]=nums[j];
                k++;
            }
        }
        return k;
    }
}