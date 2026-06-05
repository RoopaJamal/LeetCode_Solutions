class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int i=0,k=1;
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]) {
                nums[i+1]=nums[j];
                i++;
                k++;
            }
        }
        return k;
    }
}