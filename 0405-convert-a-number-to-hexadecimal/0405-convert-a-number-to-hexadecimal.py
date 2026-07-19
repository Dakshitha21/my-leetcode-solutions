class Solution:
    def toHex(self, num: int) -> str:
        if num < 0:
            num += 2 ** 32
        res = hex(num)
        return res[2:]