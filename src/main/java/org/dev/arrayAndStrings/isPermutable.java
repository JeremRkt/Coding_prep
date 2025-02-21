package org.dev.arrayAndStrings;

import java.util.HashMap;
import java.util.Map;

public class isPermutable {
    public static  boolean isPermutation(String s1, String s2){
        if (s1.length()!= s2.length()) return false;
        if (s1.length() == 0)return true;

        Map<Character, Integer> map = new HashMap<>();
        int len = s1.length();
        for (int i = 0; i < len; i++){
            char c = s1.charAt(i);
            if (map.get(c) != null){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        for (int i = 0; i < len; i++){
            char c = s2.charAt(i);
            if (map.get(c) == null){
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        isPermutable isPermutable = new isPermutable();

        String a = "abc";
        String b = "cab";

        System.out.println(isPermutation(a, b));
    }
}
