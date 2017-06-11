package com.josh.code.treesAndGraphs;

/**
 * Created by Munish on 6/1/17.
 *
 * Check Balanced: Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be a tree
 * such that the heights of the two subtrees of any node never differ by more than one.
 *
 */
public class CheckBalanced {


    public static void main(String[] args) {

    }



    private boolean isBalanced(TreeNode node){

        if(node==null){
            return true;
        }

        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);

        int diff = Math.abs(leftHeight-rightHeight);

        if(diff>1){
           return false;
        }

        boolean bal_left = isBalanced(node.left);
        boolean bal_right = isBalanced(node.right);

        return bal_left && bal_right;
    }


    private int findHeight(TreeNode node){

        if(node==null){
            return 0;
        }else{
            return Math.max(findHeight(node.left), findHeight(node.right))+1;
        }

    }



}
