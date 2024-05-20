package com.edu.pile;

public class Stack {
	private Node entryNode;
	
	
	public Stack() {
		this.entryNode = null;
	}
	
	private boolean isEmpty() {
		return entryNode == null ? true : false;
	}
	
	public void pushIntoStack(Node node) {
		
		if(isEmpty()) {entryNode = node;}
		else {
			node.setReferenceNode(entryNode);
			entryNode = node;
		}
		
	}
	
	public Node popFromStack() {
		if(isEmpty()) {System.out.println("\tThe Stack is empty.");}
		else {
			//If the stack isn't empty the new top node is the reference node
			//of the node that is being removed.
			Node toBeRemoved = entryNode;
			entryNode = toBeRemoved.getReferenceNode();
			return toBeRemoved;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder stack = new StringBuilder("**** Stack ****\n");
		
		while(!isEmpty()) {
			stack.append(entryNode + "\n");
			entryNode = entryNode.getReferenceNode();
		}	
		return stack.toString();
	}
	
}
