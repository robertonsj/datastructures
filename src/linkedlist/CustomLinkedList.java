package linkedlist;
import queue.Node;

public class CustomLinkedList<T> {
	private Node<T> head;
	private int size;
	
	public CustomLinkedList() {
		head = null;
		size = 0;
	}
	
	//Method to add an element to the end of the list
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null) { head = newNode;}
		else {
			Node<T> current = head;
			while(current.getNext() != null) {current = current.getNext();}
			current.setNext(newNode);
		}
		size++;
	}
        
        public T remove(int index){
   
            if(index < 0 || index >= size){
                throw new IndexOutOfBoundsException("Index: " + index + "Size: "+ size);
            } else if(index == 0) {
                T data = head.getData();
                head = head.getNext();
                return data;
            } else {
                Node<T> current = head;
                for(int i = 0; i < index - 1; i++){
                    current = current.getNext();
                }
                T data = current.getNext().getData();
                current.setNext(current.getNext().getNext());
                size--;
                return data;
            }
        }
	
	public String toString() {
		StringBuilder linkedList = new StringBuilder("Head: ");
		Node<T> current = head;
		while(current != null) {
			linkedList.append("--> " + current);
			current = current.getNext();
		}
		return linkedList.toString();
	}
}
	
