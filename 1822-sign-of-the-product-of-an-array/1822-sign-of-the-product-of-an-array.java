class Solution {
    public int arraySign(int[] nums) {
        int countNeg = 0, countPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                return 0;
            if(nums[i] > 0)
                countPos++;
            if(nums[i] < 0)
                countNeg++;  
        }
        if(countNeg % 2 == 1)
            return -1;
        else if(countNeg % 2 == 0)
            return 1;
        else
            return 0;
    }
}