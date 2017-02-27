/**
 * 
 */
package com.josh.tryout.trees;

/**
 * @author Munish
 *
 */
public class FindCommonAncestor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}

class BinaryTree {
	Node root;

	public void addNode(Node n) {

	}

	public void deleteNode(Node n) {

	}

	public int depthFromRoot(Node n) {
		int depth = 0;
		if (n == null) {
			return 0;
		} else {
			while (n.parent != null) {
				depth = depth + 1;
			}
		}
		return depth;
	}

	public Node findCommonAncestor(Node n1, Node n2) {

		int depth1 = depthFromRoot(n1);
		int depth2 = depthFromRoot(n2);

		int diff = depth1 - depth2;

		if (diff >= 1) {
			for (int i = 0; i < diff; i++) {
				n1 = n1.parent;
			}
		} else {
			int absDiff = Math.abs(diff);
			for (int i = 0; i < absDiff; i++) {
				n2 = n2.parent;
			}
		}

		while(n1.parent != n2.parent){
			
			n1 = n1.parent;
			n2 = n2.parent;
			
		}
		
		return n1.parent;
	}

}

class Node {

	Object data;
	Node leftChild;
	Node rightChild;
	Node parent;

	private Node() {

	}

	public Node(Node leftChild, Node rightChild, Node parent, Object data) {
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}

}