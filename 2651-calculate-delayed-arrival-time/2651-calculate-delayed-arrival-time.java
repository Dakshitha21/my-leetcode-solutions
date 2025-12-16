class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int res = 0;
        res = arrivalTime + delayedTime;
        if(res >= 0 && res <= 23)
            return res;
        else 
            return res - 24;
    }
}