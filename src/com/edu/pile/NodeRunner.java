package com.edu.pile;

public class NodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		QueueCustomized queue = new QueueCustomized();
		
		stack.pushIntoStack(new Node(1));
		stack.pushIntoStack(new Node(2));
		stack.pushIntoStack(new Node(3));
		stack.pushIntoStack(new Node(4));
		stack.pushIntoStack(new Node(5));
		
		queue.enqueue(new Node("roberto"));
		queue.enqueue(new Node("rayane"));
		queue.enqueue(new Node("jose"));
		
		System.out.println(stack);
		System.out.println(queue);
	}

}
