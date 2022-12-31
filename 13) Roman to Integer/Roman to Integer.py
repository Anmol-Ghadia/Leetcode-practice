class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        ref = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
        }
        sub_ref = {
            'IV': 4,
            'IX': 9,
            'XL': 40,
            'XC': 90,
            'CD': 400,
            'CM': 900
            }
        total = 0
        skip = False
        for index in range(len(s)):
            if skip:
                skip = False
                continue
            if (s[index:index+2] in sub_ref):
                total += sub_ref[s[index:index+2]]
                skip = True
            else:
                total += ref[s[index]]
        return total