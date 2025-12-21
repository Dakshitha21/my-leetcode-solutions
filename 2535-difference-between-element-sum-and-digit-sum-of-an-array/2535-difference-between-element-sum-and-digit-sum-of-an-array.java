class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0, digSum = 0, res = 0;
        for(int i = 0; i < nums.length; i++){
            eleSum += nums[i];
            int temp = nums[i];
            while(temp > 0){
                digSum = temp % 10 + digSum;
                temp = temp / 10;
            }
        }
        return Math.abs(digSum - eleSum);
    }
}