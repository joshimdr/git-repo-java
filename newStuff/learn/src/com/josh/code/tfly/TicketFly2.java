package com.josh.code.tfly;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TicketFly2 {

	public static void main(String[] args) {

		Node[][] objectArray = new Node[20][20];
		
		List<Node> ll = Collections.synchronizedList(new LinkedList<Node>());
		
		

	}

}

class Node {

	Node prev;
	Node next;

	int x = 0;
	int y = 0;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(Node prev, Node next, int x, int y) {
		this.prev = prev;
		this.next = next;
		this.x = x;
		this.y = y;

	}

}
