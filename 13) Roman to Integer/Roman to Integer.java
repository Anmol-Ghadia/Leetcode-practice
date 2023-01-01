
// Hashmap soln
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        HashMap<String, Integer> subMap = new HashMap<>();
        subMap.put("IV",4);
        subMap.put("IX",9);
        subMap.put("XL",40);
        subMap.put("XC",90);
        subMap.put("CD",400);
        subMap.put("CM",900);

        int total = 0;
        Boolean skip = false;
        int len = (s.toCharArray()).length;
        for (int i = 0; i < len ; i++) {
            if (skip == true) {
                skip = false;
                continue;
            };
            if (i+2 <= len &&
                subMap.get(s.substring(i,i + 2)) != null) {
                total += subMap.get(s.substring(i,i + 2));
                skip = true;
            } else {
                total += romanMap.get(s.substring(i,i+1));
            }
        }
        return total;
    }
}