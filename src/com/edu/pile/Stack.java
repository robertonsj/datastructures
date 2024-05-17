package com.edu.pile;

public class Stack {
	private Node topNode;
	
	
	public Stack() {
		this.topNode = null;
	}
	
	private boolean isEmpty() {
		return topNode == null ? true : false;
	}
	
	public void pushIntoStack(Node node) {
		
		if(isEmpty()) {topNode = node;}
		else {
			//If the stack isn't empty the new node will be the top node,
			//and the previous one will be its reference node.
			Node previousNode = topNode;
			topNode = node;
			topNode.setReferenceNode(previousNode);
			
		}
		
	}
	
	public Node popFromStack() {
		if(isEmpty()) {System.out.println("\tThe Stack is empty.");}
		else {
			//If the stack isn't empty the new top node is the reference node
			//of the node that is being removed.
			Node toBeRemoved = topNode;
			topNode = toBeRemoved.getReferenceNode();
			return toBeRemoved;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder stack = new StringBuilder("**** Stack ****\n");
		
		while(!isEmpty()) {
			stack.append(topNode);
			topNode = topNode.getReferenceNode();
		}	
		return stack.toString();
	}
	
}
