/**
 * 
 */
package com.josh.code.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author munish
 *
 */
public class MirrorOfATree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			BufferedReader br = Files.newBufferedReader(Paths.get(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean isMirror(TreeNode nodeleft, TreeNode noderight) {

		if (nodeleft.value != noderight.value) {
			return false;
		} else {
			isMirror(nodeleft.rchild, noderight.lchild);
		}
		return true;

	}

	class TreeNode {

		TreeNode lchild;
		TreeNode rchild;
		TreeNode parent;

		Object value;

		public TreeNode() {

		}

		public TreeNode(TreeNode lchild, TreeNode rchild, TreeNode parent, Object value) {
			super();
			this.lchild = lchild;
			this.rchild = rchild;
			this.parent = parent;
			this.value = value;
		}

	}

}
