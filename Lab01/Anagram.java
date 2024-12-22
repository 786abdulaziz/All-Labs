/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_datastructurelab;

/**
 *
 * @author JUNAID COMPUTER
 */
import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        // Convert strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Sort characters and compare
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        // Test with another example
        str1 = "hello";
        str2 = "world";
        result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}

    

