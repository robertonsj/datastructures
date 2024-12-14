package src.cirlinkedlist;

public class CircularLinkedList<T>{
	private Node<T> head;
	private Node<T> tail;
	
	CircularLinkedList(){
		this.tail = null;
		this.head = null;
	}
	
	void add(T element) {
		Node<T> newNode = new Node<>(element);
		if(tail == null) {
			this.head = newNode;
			this.tail = newNode;
			newNode.setNext(head);
		}
		else {
			tail.setNext(newNode);
			newNode.setNext(head);
			tail = newNode;
		}
	}
	
	String getList() {
		if(tail == null) {
			throw new RuntimeException("\nList is empty.");
		}
		else {
			Node<T> aux = head;
			String result = aux.toString();
			while(aux.getNext() != head) {
				result = result.concat(aux.getNext().toString());
				aux = aux.getNext();
			}
			return result;
		}
	}

	//SETTERS
	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
	
	
	public static void main(String[] args) {
		CircularLinkedList<String> list = new CircularLinkedList<>();
		try {
			list.add("Element 01");
			list.add("Element 02");
//			list.add("Element 03");
			System.out.println(list.getList());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}

class Node<T> {
	private T element;
	private Node<T> next;
	
	Node(T element){
		this.element = element;
		this.next = null;
	}

	//GETTERS
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	@Override
	public String toString() {
		return "Node [element=" + element + "]\n";
	}
	
}

