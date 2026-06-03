class Solution {
    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {
        int landThenWater = calculateFinishTime(
            landStartTime, landDuration, waterStartTime, waterDuration
        );
        
        int waterThenLand = calculateFinishTime(
            waterStartTime, waterDuration, landStartTime, landDuration
        );
        
        return Math.min(landThenWater, waterThenLand);
    }
    
    private int calculateFinishTime(
        int[] firstStart,
        int[] firstDuration,
        int[] secondStart,
        int[] secondDuration
    ) {
        // Find earliest finish time for first category
        int minEnd = Integer.MAX_VALUE;
        for (int i = 0; i < firstStart.length; i++) {
            minEnd = Math.min(minEnd, firstStart[i] + firstDuration[i]);
        }
        
        // Find minimum completion time for second category
        int minFinish = Integer.MAX_VALUE;
        for (int i = 0; i < secondStart.length; i++) {
            int start = Math.max(secondStart[i], minEnd);
            int finish = start + secondDuration[i];
            minFinish = Math.min(minFinish, finish);
        }
        
        return minFinish;
    }
}