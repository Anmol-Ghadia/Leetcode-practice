// O(n)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        for (int j=0; j<strs.length;j++) {
            if (smallest.length() > strs[j].length()) {
                smallest = strs[j];
            }
        }


        String prefix = "";
        for (int i=0; i<smallest.length();i++){
            char current_alphabet = strs[0].charAt(i);
            for (int word=0; word<strs.length; word++) {
                if (strs[word].charAt(i) != current_alphabet) {
                    return prefix;
                }
            }
            prefix += current_alphabet;
        }
        return prefix;
    }
}