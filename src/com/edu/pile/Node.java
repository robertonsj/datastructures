package com.edu.pile;

public class Node {
	private Object objeto;
	private Node referenceNode;
	
	public Node(Object object) {
		this.objeto = object;
		referenceNode = null;
	}
	
	public Node getReferenceNode() {
		return referenceNode;
	}
	
	public void setReferenceNode(Node node) {
		referenceNode = node;
	}

	@Override
	public String toString() {
		return "Node [objeto=" + objeto + "]";
	}
	
	
}
