class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int min = nums[0];
       int max = nums[nums.length - 1];

       while(min % max != 0){
        int rem = min % max;
        min = max;
        max = rem;
       }
       return max;
    }
}