package src.queue;

public class CustomQueue<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public CustomQueue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	//Method to add a new element into the queue.
	public void enqueue(T data) {
		Node<T> newNode = new Node<>(data);
		if(rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;
	}
	
	//Method to remove and return the data
	public T dequeue() {
		if(front == null) {
			throw new IllegalStateException("\n*** Failed to remove from queue: it is empty.");
		}else {
			System.out.println("\n*** Element has successfully been removed.");
		}
		T data = front.getData();
		front = front.getNext();
		
		if(front == null) {
			rear = null;
		}
		size--;
		return data;
	}
	
	/*
	public String toString() {
		Node<T> currentNode = front;
		StringBuilder queue = new StringBuilder("**** QUEUE ****\nFront: ");
		do {
			queue.append("--> " + currentNode);
			currentNode = currentNode.getNext();
		}while(currentNode != null);
		System.out.println();
		return queue.toString();
	}
	*/
	public void showQueue() {
		if(front == null) {
			throw new IllegalStateException("\n*** Queue is empty!\n");
		} else {
			System.out.println("\n*** Beginning of the Queue");
			Node<T> node = front;
			while(node != null) {
				System.out.println(node);
				node = node.getNext();
			}
		}
	}
}
