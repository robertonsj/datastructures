package com.edu.dio;

import java.util.ArrayList;
import java.util.List;

public class NodeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Node<String>> nodesString = new ArrayList<>();
		List<Node<Integer>> nodesInteger = new ArrayList<>();
		
		
		nodesString.add(new Node<String>("Node String one"));
		nodesString.add(new Node<String>("Node String two"));
		nodesString.add(new Node<String>("Node String three"));
		
		nodesString.get(0).setNextNode(nodesString.get(1));
		nodesString.get(1).setNextNode(nodesString.get(2));
		
//		nodesString.forEach(node -> System.out.println(node));
		for(Node<String> node : nodesString) {
			try {				
				System.out.println(node + ", next=" + node.getNextNode() + "]");
			}catch(NullPointerException e) {
				System.err.println(node + "] points no where.\n" + e.getMessage());
			}
		}
		
		
	}

}
