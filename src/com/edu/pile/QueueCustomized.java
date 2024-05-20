package com.edu.pile;

public class QueueCustomized {
	
	private Node entryNode;
	
	private boolean isEmpty() {
		return entryNode == null ? true : false;
	}
	
	private boolean pointsToNull(Node node) {
		return node.getReferenceNode() == null ? true : false;		
	}
	
	public void enqueue(Node node) {
		if(isEmpty()) {entryNode = node;}
		else {
			node.setReferenceNode(entryNode);
			entryNode = node;
	
		}
	}
	
	public Node getFirstNode() {
		Node firstNode = entryNode;
		/*
		while(!isEmpty()) {
			if(firstNode.getReferenceNode() != null) {
			}else break; 
		}*/
		
		do {			
			firstNode = firstNode.getReferenceNode();
		}while(pointsToNull(firstNode));
		
		return firstNode;
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
