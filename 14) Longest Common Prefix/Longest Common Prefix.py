# O(n)
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

# O(n) theriotically faster
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        common = strs[0]
        for i in strs:
            word_1 = common
            word_2 = i
            common = ""
            if (len(word_2) < len(word_1)):
                temp = word_1
                word_1 = word_2
                word_2 = temp
            for index,char in enumerate(word_1):
                if (char == word_2[index]):
                    common += char
                else:
                    break
        return common