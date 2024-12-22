/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_datastructurelab;

/**
 *
 * @author JUNAID COMPUTER
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if target found
            }
        }
        return -1; // Return -1 if target not found
    }

    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 8, 10};
        int target = 8;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}



    
