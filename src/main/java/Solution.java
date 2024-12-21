class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalPoisonedTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int overlap = timeSeries[i+1] - timeSeries[i];
            totalPoisonedTime += Math.min(duration, overlap);
        }
        return totalPoisonedTime + duration;
    }
}