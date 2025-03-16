package dsa1;

import java.util.*;

public class BracketsProblem {

    public static Boolean pair(char s1, char s2) {
        return  s1=='('&&s2==')'||
                s1=='['&&s2==']'||
                s1=='{'&&s2=='}';
    }
    public static void BracketsOrder(String input) {

        Stack<Character> stack = new Stack<>();
       for (int i = 0; i < input.length(); i++) {
           char c = input.charAt(i);
           if(c=='('||c=='{'||c=='[') {
               stack.push(c);
           }
           else if(c==')'||c==']'||c=='}') {
               if(stack.isEmpty()) {
                   System.out.println("Not balanced");
               }
               char top = stack.pop();
               if(!pair(top,c)){
                   System.out.println("Not balanced");
                   return;
               }
           }
       }
       if(stack.isEmpty()) {
           System.out.println("Balanced");
       }
       else {
           System.out.println("Not balanced");
       }

    }
    public static void main(String[] args) {
        String b1="{[()]}";
        BracketsOrder(b1);
        String b2="{{)}";
        BracketsOrder(b2);
        String b3="{";
        BracketsOrder(b3);
    }
}
