package src.doublelinked;
class DoubleLinkedList<T> {
	
	class Node<T> {
		T element;
		Node<T> nextNode;
		Node<T> previousNode;
		Node(T element){
			this.element = element;
			this.nextNode = null;
			this.previousNode = null;
		}
		
		//Getters and Setters
		public T getElement() {
			return element;
		}
		public void setElement(T element) {
			this.element = element;
		}
		public Node<T> getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node<T> nextNode) {
			this.nextNode = nextNode;
		}
		public Node<T> getPreviousNode() {
			return previousNode;
		}
		public void setPreviousNode(Node<T> previousNode) {
			this.previousNode = previousNode;
		}

		@Override
		public String toString() {
			return "Node [element=" + element + "]";
		}
		
	}
	
	Node<T> firstNode;
	Node<T> lastNode;
	int counter;
	
	DoubleLinkedList(){
		this.firstNode = null;
		this.lastNode = null;
		this.counter = 0;
	}
	
	//Getters and Setters
	public Node<T> getFirstNode() {
		return firstNode;
	}
	public void setFirstNode(Node<T> firstNode) {
		this.firstNode = firstNode;
	}
	public Node<T> getLastNode() {
		return lastNode;
	}
	public void setLastNode(Node<T> lastNode) {
		this.lastNode = lastNode;
	}
	public int getCounter() {
		return counter;
	}
	
	void add(T element) {
		Node<T> newNode = new Node<>(element);
		
		if(firstNode == null) {
			setFirstNode(newNode);
			setLastNode(newNode);
		} else {
			lastNode.setNextNode(newNode);
			newNode.setPreviousNode(lastNode);
			setLastNode(newNode);
		}
		counter++;
	}
	
	void add(int index, T element) {
		Node<T> newNode = new Node<>(element);
		Node<T> auxNode = getFirstNode();
		
		for(int i = 1; i <= index; i++) {
			auxNode = auxNode.getNextNode();
		}
		newNode.setPreviousNode(auxNode.getPreviousNode());
		auxNode.getPreviousNode().setNextNode(newNode);
		newNode.setNextNode(auxNode);
		auxNode.setPreviousNode(newNode);
		
	}
	
	void displayNodes() {
		var auxNode = getFirstNode();
		while(auxNode != null) {
			System.out.println(auxNode);
			auxNode = auxNode.getNextNode();
		}
		System.out.println("=== End ===");
	}
	
	public static void main(String[] args) {
		DoubleLinkedList<String> doubleLinkedList = 
				new DoubleLinkedList<>();
		
		doubleLinkedList.add("one");
		doubleLinkedList.add("two");
		doubleLinkedList.add("three");
		doubleLinkedList.add("four");
		doubleLinkedList.displayNodes();
		
		doubleLinkedList.add(1, "five");
		doubleLinkedList.displayNodes();
		
		doubleLinkedList.add(3, "six");
		doubleLinkedList.displayNodes();
		
	}
	
}
