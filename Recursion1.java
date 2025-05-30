package dsa1;

public class Recursion1 {
    //printing numbers from 5 to 1
    public static void printRecursion(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printRecursion(n-1);
    }
    //printing numbers from 1 to 5
    public static void printRecursion2(int n) {
        if(n == 6){
            return;
        }
        System.out.println(n);
        printRecursion2(n+1);
    }
    //Sum of first n natural numbers
    public static void sumOfNaturalNumbers(int i,int n,int sum) {
        //i is the starting value
        //n is the ending value and sum gives the sum from i to  n
        if(i==n){
            sum+=n;
            System.out.println("The sum is :"+sum);
            return;
        }
        sum+=i;
        sumOfNaturalNumbers(i+1,n,sum);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fac=n*factorial(n-1);
        return fac;
    }
    public static void main(String[] args) {
        //printRecursion(5);
         // printRecursion2(1);
        sumOfNaturalNumbers(1,5,0);
        System.out.println(factorial(5));
    }
}
