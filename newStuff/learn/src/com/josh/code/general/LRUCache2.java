/**
 * 
 */
package com.josh.code.general;

import java.util.HashMap;

/**
 * @author munish
 *
 */
public class LRUCache2 {

	HashMap<Integer, Node> cacheMap = new HashMap<Integer, Node>();
	Node head;
	Node tail;
	int capacity = 10;

	public Node getNode(Integer key) {

		Node returnNode = null;
		if (cacheMap.containsKey(key)) {

			returnNode = cacheMap.get(key);

			// remove node from the cache
			removeNode(returnNode);

			// set return node to the head
			setHead(returnNode);

			return returnNode;

		}

		return null;

	}

	private void setHead(Node returnNode) {

		returnNode.next = head;
		returnNode.prev = null;

		head = returnNode;

	}

	private void addNode(Node nodeToAdd) {

		if (cacheMap.size() >= capacity) {

			cacheMap.remove(tail.key);
			tail = tail.prev;

		}
		cacheMap.put(nodeToAdd.key, nodeToAdd);

		setHead(nodeToAdd);

	}

	private void removeNode(Node returnNode) {
		// TODO Auto-generated method stub

		// node in teh middle
		if (returnNode.prev != null && returnNode.next != null) {

			returnNode.prev.next = returnNode.next;
			returnNode.next.prev = returnNode.prev;
		}
		// node at head
		if (returnNode.prev == null) {
			head = returnNode.next;
		}

		// if node is the tail
		if (returnNode.next == null) {
			tail = returnNode.prev;
		}

		cacheMap.remove(returnNode.key);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Node {
	Integer key;
	Object value;
	Node prev = null;
	Node next = null;

	public Node() {

	}

	public Node(Object value) {
		this.value = value;
	}

}
