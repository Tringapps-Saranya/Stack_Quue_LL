package datastructure;

public class Queue {
	private int[] arr;      
    private int front;      // front points to the front element in the queue
    private int rear;       // rear points to the last element in the queue
    private int size;       
    private int count;      
 
    // Constructor to initialize a queue
    Queue(int size)
    {
        arr = new int[size];
        this.size = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    // To add an item to the queue
    public void enqueue(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println(" Queue Overflow!!\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + item);
 
        rear = (rear + 1) % size;
        arr[rear] = item;
        count++;
    }
  
    // To dequeue the front element
    public int dequeue()
    {
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("Queue Underflow!!\n");
            System.exit(-1);
        }
 
        int x = arr[front];
 
        System.out.println("Removing " + x);
 
        front = (front + 1) % size;
        count--;
 
        return x;
    }
 
    // To return the front element of the queue
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println(" Queue Underflow!!\n");
            System.exit(-1);
        }
        return arr[front];
    }
 
    // To return the size of the queue
    public int size() {
        return count;
    }
 
    // To check if the queue is empty or not
    public boolean isEmpty() {
        return (size() == 0);
    }
 
    // To check if the queue is full or not
    public boolean isFull() {
        return (size() == size);
    }
    
    public static void main (String[] args)
    {
        Queue queue = new Queue(10);
 
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
 
        System.out.println("The front element is " + queue.peek());
        
        queue.dequeue();
        
        System.out.println("The front element is " + queue.peek());
 
        System.out.println("The queue size is " + queue.size());
 
        queue.dequeue();
        queue.dequeue();
 
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
   }
}
