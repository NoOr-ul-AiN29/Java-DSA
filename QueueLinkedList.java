package dsa1;

import java.util.LinkedList;

public class QueueLinkedList {
    //Implementing Queue using linked list
    static Node head=null;
    static Node tail=null;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Boolean isEmpty(){
        return head == null&&tail == null;
    }
    public static void add(int n){
       Node newNode = new Node(n);
        if(isEmpty()){
            head = tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        if(tail==head){
            tail=head=null;
        }
        Node temp = head;
        head = head.next;
        return temp.data;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove();
        list.add(6);
        list.remove();
        list.add(7);
        while(!list.isEmpty()){
            System.out.println(list.peek());
            list.remove();
        }
    }
}
