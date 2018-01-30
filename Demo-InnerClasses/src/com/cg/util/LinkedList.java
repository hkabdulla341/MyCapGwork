package com.cg.util;

public class LinkedList {

	private Node head, last;

	// This is a nested class
	public static class NestedClass {
 
	}

	public boolean add(int data){
		
//		TODO	Create a new node and assign data to it
		
		Node node = this.new Node(data);
		
		if(head == null){
			head = last = node;
		}else{
			last.next = node;
			last = node;
		}
		return true;
	}

	public void display(){
		Node temp =head;
		
		while(temp != null){
			System.out.print(temp.data + "\t");
			temp = temp.next;
		}
		
	}
	
	
	
	
	// Inner class

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
		}
	}

}
