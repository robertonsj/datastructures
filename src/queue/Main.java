package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue<Integer> queue= new CustomQueue<>();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println(queue);
	}

}
