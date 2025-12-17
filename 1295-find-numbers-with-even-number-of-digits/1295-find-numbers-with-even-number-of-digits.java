class Solution {
    public int findNumbers(int[] nums) {
        int countNum = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            int digit = 0;
            while(nums[i] > 0){
                digit = nums[i] / 10;
                count++;
                nums[i] = nums[i] / 10;
            }
            if(count % 2 == 0)
                    countNum++;
        }
        return countNum;
    }
}