package queue;

import stack.CustomStack;
import linkedlist.CustomLinkedList;

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
		
                System.out.println("**** LINKED LIST ****");
		CustomLinkedList<Double> linkedList = new CustomLinkedList<>();
		linkedList.add(1.78);
		linkedList.add(1.72);
		linkedList.add(1.75);
		System.out.println(linkedList);
                System.out.println("Removed element: " + linkedList.remove(2));
                System.out.println(linkedList);
                
	}

}
