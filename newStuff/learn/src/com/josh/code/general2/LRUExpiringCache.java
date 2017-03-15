/**
 * 
 */
package com.josh.code.general2;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author munish
 *
 */
public class LRUExpiringCache {

	HashMap<Integer, Node> cacheMap = new HashMap<Integer, Node>();
	Node head;
	Node tail;
	int capacity = 10;
	long expiryInMillis = 10000;

	public Node getNode(Integer key) {

		Node returnNode = null;
		long currentTimeInMillis = System.currentTimeMillis();

		Node nfound = cacheMap.get(key);

		if (nfound != null) {

			// remove node from the cache and put it in the head of the list
			removeNode(nfound);

			// set return node to the head
			setHead(nfound);

			return nfound;

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
	static long timestmapInMillis = 0;

	public Node() {

	}

	public Node(Object value) {
		this.value = value;
	}

}
