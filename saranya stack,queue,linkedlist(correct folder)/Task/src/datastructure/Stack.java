package datastructure;

public class Stack {
	private int arr[];
    private int top;
    private int size;
 
    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new int[size];
        this.size = size;
        top = -1;
    }
 
    //  To add an element `x` to the stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Stack is overflow!!\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // To pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println(" Stack is Underflow!!\n");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
 
        return arr[top--];
    }
 
     //To return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
 
    // To return the size of the stack
    public int size() {
        return top + 1;
    }
 
    //  To check if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;               
    }
 
    // To check if the stack is full or not
    public boolean isFull() {
        return top == size - 1;     
    }

 


    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);      
        stack.push(2);      
 
        stack.pop();        
        stack.pop();        
 
        stack.push(3);      
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
