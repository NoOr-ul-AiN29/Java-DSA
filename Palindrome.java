package dsa1;

import java.util.ArrayList;

public class Palindrome {
    //Checking if the linked list is palindromic
    Node head;
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void addFirst(int a){
         Node newNode = new Node(a);
            if(head == null){
                head = newNode;

            }
            else {
                newNode.next = head;
                head = newNode;
            }
        }
        public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
        }
        public boolean checkPalindrome(){
            ArrayList<Integer> arr = new ArrayList<>();
            Node temp=head;
            while(temp!=null){
                arr.add(temp.data);
                temp=temp.next;
            }
            int j=arr.size()-1;
            for(int i=0;i<j;i++){
                if(!arr.get(i).equals(arr.get(j))){
                    return false;
                }
                j--;
            }
       return true;

        }

    public static void main(String[] args) {
        Palindrome list = new Palindrome();

        list.addFirst(1);
        list.addFirst(0);
        list.addFirst(0);
        list.addFirst(1);

        list.display();
        System.out.println("Palindromic: "+list.checkPalindrome());


    }
}
