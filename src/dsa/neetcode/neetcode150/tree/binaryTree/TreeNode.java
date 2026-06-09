package dsa.neetcode.neetcode150.tree.binaryTree;

public class TreeNode {

    TreeNode left;
    TreeNode right;

    int value;

    public TreeNode(int value, TreeNode left, TreeNode right){
        this.value=value;
        this.left=left;
        this.right=right;
    }

    public TreeNode(int value){
        this.value=value;
    }

}


