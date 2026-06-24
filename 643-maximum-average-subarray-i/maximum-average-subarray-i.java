class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxSum=sum;
        for(int i=1;i<=nums.length-k;i++){
            sum=sum-nums[i-1]+nums[k+i-1];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum/k;
    }
}