package com.edu.pile;

public class Node {
	private int content;
	private Node referenceNode = null;
	
	public Node(int content) {
		this.content = content;
	}
	
	public Node getReferenceNode() {
		return referenceNode;
	}
	
	public void setReferenceNode(Node node) {
		referenceNode = node;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + "]\n";
	}
	
	
}
