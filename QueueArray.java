package dsa1;

public class QueueArray {
    //Implementing queue with array
   int[] arr;
   int front;
   int rear;
   public QueueArray(int size) {
       arr = new int[size];
       this.front=-1;
       this.rear=-1;
   }
   public boolean isEmpty(){
       return front==-1&&rear==-1;
   }
   public boolean isFull(){
       return rear==arr.length-1;
   }
   public void enQueue(int data) {
       if(isEmpty()){
           front++;
           rear++;
           arr[front]=data;
           return;
       }
       if(isFull()){
           System.out.println("Queue is full");
           return;
       }
       rear++;
       arr[rear]=data;
   }
   public int deQueue() {
       if(isEmpty()){
           System.out.println("Queue is empty");
           return -1;
       }
       if(front==rear){
           int temp=arr[front];
           rear=-1;
           front=-1;
           return temp;
       }
       int temp=arr[front];
       front++;
       return temp;
   }
   public int peek() {
       if(isEmpty()){
           System.out.println("Queue is empty");
           return -1;
       }
       return arr[front];
   }
   public void display() {
       if(isEmpty()){
           System.out.println("Queue is empty");
           return;
       }
       for(int i=front;i<=rear;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.display();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        System.out.println(q.deQueue());
        q.display();
    }

}
