/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Ali Computers
 */
public class Queue_Array {
    private int[] array;
    private int front;
    private int rear;
    private int maxSize;
    public Queue_Array(int size){
        array=new int[size];
        maxSize=size;
        front=-1;
        
    }
    public void Equeue(int data){
        if(rear==maxSize-1){
            System.out.println("QUEUE IS FULL");
            return;
        }
        array[++rear]=data;
        System.out.println("INSERTION: "+data); 
    }
    public int deqeue(){
        if(front==-1){
            System.out.println("STACK IS EMPPTY");
            return -1;
        }
        return  array[front--];
    }
     public static void main(String args[]){
         Queue_Array a = new Queue_Array(9);
         System.out.println("INSERTION OF DATA");
         a.Equeue(10);
         a.Equeue(20);
         a.Equeue(30);
         a.deqeue();
         
         
     }      
}
