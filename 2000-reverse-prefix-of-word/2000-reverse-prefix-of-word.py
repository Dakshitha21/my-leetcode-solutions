class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        index = word.find(ch)
        char = list(word[:index + 1])
        l = 0
        r = len(char) - 1
        while l < r:
            temp = char[l]
            char[l] = char[r]
            char[r] = temp
            l += 1
            r -= 1
        return ''.join(char) + word[index + 1:]