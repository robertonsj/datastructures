package linkedlist;
import queue.Node;

public class CustomLinkedList<T> {
	private Node<T> head;
	private int size;
	
	public CustomLinkedList() {
		head = null;
		size = 0;
	}
	
	//Method to add an element to the end of the list
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) { head = newNode;}
		else {
			Node<T> current = head;
			while(current.getNext() != null) {current = current.getNext();}
			current.setNext(newNode);
		}
		size++;
	}
	
	public String toString() {
		StringBuilder linkedList = new StringBuilder("**** LINKED LIST ****\nHead: ");
		Node<T> current = head;
		while(current != null) {
			linkedList.append("--> " + current);
			current = current.getNext();
		}
		return linkedList.toString();
	}
}
	
