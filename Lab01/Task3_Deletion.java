/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_datastructurelab;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Task3_Deletion {
    public static void main(String[] args) {
        int [] numbers={8,16,24,32,40};
        
        int delete_index=2;
        
       for(int i = delete_index; i < numbers.length -1 ; i++){
          numbers[i] = numbers [i + 1];
       }
       
       numbers[numbers.length -1] = 0;
       
       System.out.println("\n Array after insertion at the end :");
        for(int i = 0;i< numbers.length; i++){
            System.out.println("Element at index "+ i +" : "+numbers[i]);
            
        }
    }
    
    
}
