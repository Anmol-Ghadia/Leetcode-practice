// Using int and math
class Solution {
    public boolean isPalindrome(int x) {
    if (0>x) {
        return false;
    }
    int oldNum = x;
    int newNum = 0;

    while (x > 0) {
        newNum = x%10 + newNum*10;
        x /= 10;
    }
    return (oldNum == newNum);
    }
}

// Using String
class Solution {
    public boolean isPalindrome(int x) {
        String y = String.valueOf(x);
        int front = 0;
        int end = y.length() -1;

        while (front <= end) {
            if (y.charAt(front) != y.charAt(end)) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }
}

// Using Array
class Solution {
    public boolean isPalindrome(int x) {
        char[] y = String.valueOf(x).toCharArray();
        int len = y.length;
        int len_orignal = len;
        if (len % 2 == 0) {
            len = len/ 2;
        } else {
            len = (len + 1)/ 2;
        }
        for (int i=0; i < len; i++) {
            if (y[i] != y[len_orignal - i - 1]) {
                return false;
            }
        }
        return true;
    }
}