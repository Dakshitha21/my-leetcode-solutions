class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        result = " ".join(s.split())
        words = result.split()
        length_of_last_word = len(words[-1])
        return length_of_last_word