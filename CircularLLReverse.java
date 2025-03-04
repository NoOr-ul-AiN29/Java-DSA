package dsa1;

public class CircularLLReverse {
    //reversing a circular linked list
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static Node tail;
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node temp = head;
        if(head==tail){
            head.next = newNode;
            tail = newNode;
            tail.next=head;
            return;
        }
        while (temp.next!=head) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
        tail.next=head;

    }
    public static void display(){
        Node temp = head;
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println();
    }
    public static void reverse() {
        if(head==null||head.next==null){
            return;
        }
        Node temp = head;
        Node prev=null;
        Node next;
       do{
           next = temp.next;
           temp.next = prev;
           prev = temp;
           temp = next;

       } while(temp!=head);
       tail=head;
       head=prev;
       tail.next=prev;


    }
    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        display();
        reverse();
        display();
    }
}
