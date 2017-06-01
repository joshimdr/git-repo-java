package com.josh.code.treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Munish on 5/25/17.
 */
public class ListOfDepths {


    public static void main(String[] args) {

        List<ArrayList<TreeNode>> lists = new ArrayList();

        //listOfDepths(lists, new TreeNode(), 1);


    }


    public static void listOfDepths(List<LinkedList<TreeNode>> lists, TreeNode node, int level) {

        LinkedList<TreeNode> list = null;
        if (lists.size() < level) {
            // We have not added that level yet
            list = new LinkedList<TreeNode>();
            lists.add(list);

        } else {

            list = lists.get(level);
        }

        list.add(node);

        listOfDepths(lists, node.left, level + 1);
        listOfDepths(lists, node.right, level + 1);
    }


}

