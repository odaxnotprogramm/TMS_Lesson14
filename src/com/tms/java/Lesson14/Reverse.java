package com.tms.java.Lesson14;

public class Reverse {
    public String reverseString (String word) {
        Reversible wordForReverse = str -> String.valueOf(new StringBuilder(str).reverse());
        return wordForReverse.reverse(word);
    }
}
