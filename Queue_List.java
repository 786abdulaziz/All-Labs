/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Ali Computers
 */
public class Queue_List {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node front;
    private Node rear;
    public Queue_List(){
        this.front=null;
        this.rear=null;
    }
    public void Enqueue(int data){
        Node newNode = new Node(data);
        if (rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        System.out.println("EQUEE: "+data);
    }
    public int dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            front=rear=null;
            return -1;
        }
        int value=front.data;
        front=front.next;
        return value;
    }
    public static void main(String args[]){
        Queue_List LL = new Queue_List();
        System.out.println("------EQUEUED DATA-------");
        LL.Enqueue(10);
        LL.Enqueue(20);
        LL.Enqueue(30);
        System.out.println("--------DELETION OF DATA--------");
        LL.dequeue();
        
    }
}
