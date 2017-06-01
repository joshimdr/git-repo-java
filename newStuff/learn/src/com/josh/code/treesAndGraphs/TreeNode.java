package com.josh.code.treesAndGraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Munish on 6/1/17.
 */
public class TreeNode {

    int id;
    TreeNode left;
    TreeNode right;
    ArrayList<TreeNode> tnodes = new ArrayList<TreeNode>();
    Status status;

    public List getAllChilds() {
        return tnodes;
    }
}
