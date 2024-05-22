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
