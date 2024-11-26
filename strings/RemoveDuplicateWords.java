package com.strings;

import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String s="Happy Happy Birthday happy";
        String sentence = s.toLowerCase(); 

        String[] s1 = sentence.split(" ");
        String res = "";

        for (int i = 0; i < s1.length; i++) {
            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i].equals(s1[j])) {
                    s1[j] = "r";
                }
            }
        }

        for (String w : s1) {
            if (!w.equals("r")) {
                res += w + " ";
            }
        }

        System.out.println(res.trim());
    }
}
