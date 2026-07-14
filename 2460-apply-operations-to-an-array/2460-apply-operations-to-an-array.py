class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        l = 0
        r = l + 1
        while r < len(nums) :
            if nums[l] == nums[r]:
                nums[l] *= 2
                nums[r] = 0
            l += 1
            r += 1
        pos = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                temp = nums[i]
                nums[i] = nums[pos]
                nums[pos] = temp
                pos += 1
        return nums