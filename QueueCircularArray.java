package dsa1;

public class QueueCircularArray {
    static int arr[];
    static int front=-1;
    static int rear=-1;
    static int size;
    public static class Queue{

        Queue(int n){
            arr=new int[n];
            size=n;
        }
        public static boolean isEmpty(){
            return front==-1&&rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(isEmpty()){
                front++;
                arr[front]=data;
                rear=front;
                return;
            }

            rear=(rear+1)%size;
            arr[rear]=data;

        }
        //O(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            if(front==rear){
                front=-1;
                rear=-1;
                return -1;
            }
            int data=arr[front];
            front=(front+1)%size;
            return data;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
