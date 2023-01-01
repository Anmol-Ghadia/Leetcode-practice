# O(n^2)
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        out_str = ""

        # i is the index of char being checked
        # only check as many char as in the smallest string
        for i in range(min(map(len,strs))):
            out_str += strs[0][i]
            for j in strs:
                if (out_str[i] != j[i]):
                    return out_str[:-1]
        return out_str

# could be improved to O(n) by itterating and eleminating chars