package queue;

public class Node<T> {
	private Node<T> next;
	private T data;
	
	public Node(T data) {
		this.next = null;
		this.data = data;
	}
	
	public Node<T> getNext(){
		return next;
	}
	public void setNext(Node<T> node) {
		this.next = node;
	}
	
	public String toString() {
		return "Node [data=" + this.data + "]";
	}
}
