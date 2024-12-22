/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_datastructurelab;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Palindrome {
     public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str.toLowerCase()).reverse().toString();
        return str.toLowerCase().equals(reversed);
    }

    public static void main(String[] args) {
        String input = "Radar";
        boolean result = isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    
    }
} 

