class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // best we can reach from current range
            farthest = Math.max(farthest, i + nums[i]);

            // current jump range finished
            if (i == currentEnd) {

                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}