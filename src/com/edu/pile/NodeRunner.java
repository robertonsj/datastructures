package com.edu.pile;

public class NodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		stack.pushIntoStack(new Node(1));
		stack.pushIntoStack(new Node(2));
		stack.pushIntoStack(new Node(3));
		stack.pushIntoStack(new Node(4));
		stack.pushIntoStack(new Node(5));
		
		System.out.println(stack);
	}

}
