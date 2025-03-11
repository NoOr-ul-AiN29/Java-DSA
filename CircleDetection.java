package dsa1;

import java.util.LinkedList;

public class CircleDetection {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    //circle detection in LinkedList
    public static void circleDetection(Node head) {
        if (head == null) {
            System.out.println("LIST IS EMPTY");
            return;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("THE LIST IS CIRCULAR");
                return;
            }
        }

        System.out.println("THE LIST IS NOT CIRCULAR");
    }
    //Adding elements to a singly LinkedList
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static Node head2;
    static Node tail2;
    //Adding elements to a circular LinkedList
    public static void addToCircle(int data){
        Node newNode = new Node(data);
        if(head2 == null){
            head2=tail2=newNode;
            newNode.next=head2;
            return;
        }
        tail2.next = newNode;
        newNode.next=head2;
        tail2=newNode;
    }



    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        circleDetection(head);
        addToCircle(1);
        addToCircle(2);
        addToCircle(3);
        addToCircle(4);
        addToCircle(5);
        circleDetection(head2);

    }
}
