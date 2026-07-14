class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        int pos;
        for(int i=0;i<nums.length*2;i++){
            if(i<nums.length) pos=i;
            else pos=i-nums.length;
            res[i]=nums[pos];
        }
        return res;
    }
}