class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        chars = list(s[:k])
        l = 0
        r = len(chars) - 1
        while l < r:
            chars[l], chars[r] = chars[r], chars[l]
            l += 1
            r -= 1
        return "".join(chars) + s[k:]