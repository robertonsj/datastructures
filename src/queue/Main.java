package queue;

import stack.CustomStack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue<Integer> queue= new CustomQueue<>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue);
		
		CustomStack<String> stack = new CustomStack<>();
		stack.push("José");
		stack.push("Rayane");
		stack.push("Roberto");
		System.out.println(stack);
	}

}
