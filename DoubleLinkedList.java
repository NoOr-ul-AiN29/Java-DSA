package lab;

public class DoubleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node previous;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    static Node head;
    //Add to last function
    public static void addLast(int a){
        Node newnode=new Node(a);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.previous=temp;

    }
    //Add to first
    public static void addFirst(int a){
        Node newnode=new Node(a);
        if(head==null){
            head=newnode;
            return;
        }
        head.previous=newnode;
        newnode.next=head;
        head=newnode;
    }
    //Adding at the position after the value
    public static void addMid(int i,int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==i){
                newnode.next=temp.next;
                temp.next.previous=newnode;
                temp.next=newnode;
                newnode.previous=temp;
            }
            temp=temp.next;
        }
    }
        //deleting the value
    public static void deleteByValue(int value){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.data!=value){
            temp=temp.next;
        }
        if(temp.data!=value){
            System.out.println("Value is not in the list");
            return;
        }
        if(temp==head){
            head=head.next;
            return;
        }
        temp.previous.next=temp.next;
        temp.next.previous=temp.previous;
    }
    //deleting the first data
    public static void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    //deleting the last data
    public static void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp==head){
            head=null;
        }
        else{
            temp.previous.next=null;
        }
    }
    //Searching by value
    public static void searchByValue(int value){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                System.out.println(temp.data);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Value is not in the list");
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.display();
        list.addMid(4,44);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteByValue(5);
        display();
        searchByValue(3);
    }
}
