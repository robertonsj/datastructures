package com.edu.pile;

public class QueueCustomized {
	
	private Node entryNode;
	
	private boolean isEmpty() {
		return entryNode == null ? true : false;
	}
	
	private boolean pointsToNull(Node node) {
		return node.getReferenceNode() == null ? true : false;		
	}
	
	private Node getFirstNode() {
		
		Node firstNode = entryNode;
		
		do {			
			firstNode = firstNode.getReferenceNode();
		}while(!pointsToNull(firstNode));
		
		return firstNode;
	}
	
	public void enqueue(Node node) {
		if(isEmpty()) {entryNode = node;}
		else {
			node.setReferenceNode(entryNode);
			entryNode = node;
	
		}
	}
	
	public void dequeue() {
		Node newFirstNode = entryNode;
		if(isEmpty()) {
			System.err.println("The queue is empty!\n");
		}else if(newFirstNode.getReferenceNode() == null){
			entryNode = null;
		} else {
			while(!newFirstNode.getReferenceNode().equals(getFirstNode())) {
				newFirstNode = newFirstNode.getReferenceNode();
			}
			newFirstNode.setReferenceNode(null);
		}
	}

	public String toString() {
		Node node = entryNode;
		StringBuilder queue = new StringBuilder(
				"**** Queue ****\n" + node);
		do {
			node = node.getReferenceNode();
			queue.append(" ---> " + node);
			
		}while(!pointsToNull(node));
		
		return queue.toString();
	}
	
}
