/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_datastructurelab;

/**
 *
 * @author JUNAID COMPUTER
 */
public class Insert_at_middle {
     public static void main(String[] args) {
        int []nums=new int[6];
    nums[0]=10;
    nums[1]=20;
    nums[2]=30;
    nums[3]=40;
    nums[4]=50;
    nums[5]=60;
       
       for(int i=0;i<nums.length;i++){
           System.out.println("Element at index " + i +" : "+nums[i]); 
    }
       int new_element = 25;
       int position = 2;
       for(int i=nums.length-1; i>position; i--){
       nums[i] = nums[i-1];
       
       }
       nums[position]= new_element;
       
        System.out.println("\n Array after insertion at the start:");
        for(int i = 0;i< nums.length; i++){
            System.out.println("Element at index "+ i +" : "+nums[i]);
            
        }
    }
}
