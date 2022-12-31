
// 
class Solution {
    public boolean isPalindrome(int x) {
        char[] y = String.valueOf(x).toCharArray();
        int len = y.length;

        for (int i=0; i < len; i++) {
            if (y[i] != y[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}


// Minor improvement in memory
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