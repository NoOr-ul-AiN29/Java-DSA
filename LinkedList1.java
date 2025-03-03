package dsa1;

public class LinkedList1 {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public static void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addFirst(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        printList(head);
        removeFirst();
        printList(head);
        removeLast();
        printList(head);
    }
}
