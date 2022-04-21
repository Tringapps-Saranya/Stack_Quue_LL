package sample;
public class LinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void insertNode(int data) {
		Node newnode = new Node(data);
		
		if(head == null) {
			//If list is empty, both head and tail will point to new node 
			head = newnode;
			tail = newnode;
		}
		 else {    
	        
	            tail.next = newnode;      
	            tail = newnode;    
	        }    
	}
	
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}        
	
	public void addLast(int data) {
		Node newnode = new Node(data);
		newnode.data = data;
		newnode.next = null;
		tail.next = newnode;
		tail = newnode;
	}
	
	public void display() {
		 //display all the nodes present in the list    		
		Node current = head;
		
		if(head==null) {
			    
			System.out.println("List is Empty");
		}
		System.out.println("Linked list items:");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }    


	public void deletenode(int deleteIndex) {
		Node current = head;
		if(head == null) {
			System.out.println("EMPTY LIST");
		}
		else {

			for(int i = 0; i < deleteIndex - 1 ;i++) {
				current = current.next;
			}
			current.next = current.next.next;

		}
		
	}
	 public boolean search(int searchElement) {
		 Node temp = head;
		 if(head == null) {
		 System.out.println("EMPTY LIST");
		 }
		 else {
		 while(temp != null) {
		 if(temp.data == searchElement) {

		 return true;
		 }
		 temp = temp.next;

		 }

		 }
		 return false;

		 }

	public static void main(String args[]) {
		 LinkedList list = new LinkedList();
		  list.addFirst(1);
		  list.insertNode(2);
		  list.insertNode(3);
		  list.insertNode(5);	
		  list.addLast(6);
		  list.deletenode(5);
		  boolean search= list.search(3);
		  if(search) {
			  System.out.println("Search is found");
		  }
		  else {
			  System.out.println("search is not found");
		  }
		  list.display();
	}
	

}
