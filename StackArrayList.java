package dsa1;

import java.util.*;

public class StackArrayList {
    //stack through Arraylist
    static ArrayList<Integer> arr=new ArrayList<>();
    public static class Stack{
        public Boolean Isempty(){
            return arr.size()==0;
        }
        public void push(int x){
            arr.add(x);
        }
        public int pop(){
            if(Isempty()){
                return -1;
            }
            int top=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        public int peek(){
            if(Isempty()){
                return -1;
            }
            return arr.get(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.Isempty()){
            System.out.println(s.peek());
        s.pop();
        }
    }
}
