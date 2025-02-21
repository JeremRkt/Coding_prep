package org.dev.arrayAndStrings;

import java.util.HashSet;
import java.util.Set;

public class isUnique {

    public static boolean isUnique(String s){
        //O(n²) - Brute force
        /*
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j))return false;
            }
        }
        return true;*/

        //HashSet - O(n)
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()){
            set.add(c);
        }
        return (s.length() == set.size());

    }

    public static void main(String[] args) {
        isUnique isUnique = new isUnique();

        System.out.println(isUnique("avaa\n"));

        System.out.println(isUnique("ab"));
    }
}
