class Solution:
    def reverse(self, x: int) -> int:
        INT_MIN, INT_MAX = -2**31, 2**31 - 1
        reversed_str = str(abs(x))[::-1]
        result = int(reversed_str)
        if x < 0:
            result = -result
        if result < INT_MIN or result > INT_MAX:
            return 0
            
        return result
