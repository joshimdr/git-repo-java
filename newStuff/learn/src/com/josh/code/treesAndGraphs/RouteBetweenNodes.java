package com.josh.code.treesAndGraphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Munish on 5/23/17.
 */
public class RouteBetweenNodes {


    public static void main(String[] args) {

    }

    private static boolean isThereAPathBetweenNodes(TreeNode source, TreeNode destination) {

        Queue<TreeNode> q = new LinkedList<TreeNode>();

        q.add(source);

        while (!q.isEmpty()) {

            TreeNode tn = q.poll();

            tn.status = Status.VISITED;

            List<TreeNode> childs = tn.getAllChilds();

            for (TreeNode child : childs) {

                if (child.status == Status.UNVISITED) {

                    if (child == destination) {
                        return true;
                    } else {
                        q.add(child);
                    }
                }

            }
        }
        return false;
    }


}
