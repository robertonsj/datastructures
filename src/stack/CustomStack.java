package stack;

import queue.Node;

public class CustomStack<T> {
	private Node<T> top;
	private int size;
	
	public CustomStack() {
		top = null;
		size = 0;
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(top);
		top = newNode;
		size++;
	}
	
	public String toString() {
		StringBuilder stack = new StringBuilder("**** STACK ****\nTop:\n");
		Node<T> currentNode = top;
		
		while(currentNode != null) {	
			stack.append(currentNode + "\n");
			currentNode = currentNode.getNext();
		}
		System.out.println();
		return stack.toString();
	}
}
