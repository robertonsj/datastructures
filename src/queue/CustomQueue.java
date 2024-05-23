package queue;

public class CustomQueue<T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public CustomQueue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	//Method to add a new element to the queue.
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
			throw new IllegalStateException("Queue is empty.");
		}
		T data = front.getData();
		front = front.getNext();
		
		if(front == null) {
			rear = null;
		}
		size--;
		return data;
	}
	
	public String toString() {
		Node<T> currentNode = front;
		StringBuilder queue = new StringBuilder("**** QUEUE ****\n");
		do {
			queue.append("<-- " + currentNode);
			currentNode = currentNode.getNext();
		}while(currentNode != null);
		return queue.toString();
	}
	
}
