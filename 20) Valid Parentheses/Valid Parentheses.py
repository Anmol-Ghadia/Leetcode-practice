# Hash Map O(n)
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        map = {
            "(":")",
            "[":"]",
            "{":"}"
        }
        stack = []
        for char in s:
            if char in map:
                stack.append(map[char])
            elif char in [")","]","}"]:
                if stack != [] and char == stack.pop():
                    continue
                else:
                    return False
        if stack == []:
            return True
        else:
            return False

# No Hash Map O(n)
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for char in s:
            if char == "(":
                stack.append(")")
            elif char == "[":
                stack.append("]")
            elif char == "{":
                stack.append("}")
            elif char in [")","]","}"]:
                if stack != [] and char == stack.pop():
                    continue
                else:
                    return False
        if stack == []:
            return True
        else:
            return False
    