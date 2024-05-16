package com.edu.dio;

public class Node<T> {
	private T conteudo;
	private Node<T> nextNode;
	
	public Node(T conteudo) {
		this.nextNode = null;
		this.conteudo = conteudo;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public T getNextNode() {
		return nextNode.conteudo;
	}

	@Override
	public String toString() {
		return "Node [conteudo=" + conteudo;
	}
	
	
}
