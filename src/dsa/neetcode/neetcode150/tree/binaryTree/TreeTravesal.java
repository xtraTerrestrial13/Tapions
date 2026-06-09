package dsa.neetcode.neetcode150.tree.binaryTree;

public class TreeTravesal {

    //Breadth First

    /*
    //Depth First Traversals --> 3 are most popular
    Inorder (left root right)
    Pre-order (root left right)
    Post-order (left right root)

    we visit left sub-tree first--> in all three



    */
    public void inOrderTravesal(TreeNode root){
    if(root==null){
        return;
    }
    inOrderTravesal(root.left);
    System.out.println(root.value);
    inOrderTravesal(root.right);
    }

    public void preOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        inOrderTravesal(root.left);
        inOrderTravesal(root.right);
    }

    public void postOrderTravesal(TreeNode root){
        if(root==null){
            return;
        }
        inOrderTravesal(root.left);
        inOrderTravesal(root.right);
        System.out.println(root.value);
    }

    public int heightOfTree(TreeNode root){
        if (root==null){
            return 0;
        }
        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    public static void main(String[] args) {

        TreeNode binaryTree  = new TreeNode(10,
                new TreeNode(2, new TreeNode(8, new TreeNode(110), new TreeNode(120)), new TreeNode(30)),
                new TreeNode(5, new TreeNode(1,new TreeNode(15),new TreeNode(25)), new TreeNode(34)));

        TreeTravesal treeTravesal = new TreeTravesal();
        treeTravesal.inOrderTravesal(binaryTree);
        System.out.println("\n \n");
        treeTravesal.preOrderTravesal(binaryTree);
        System.out.println("\n \n");
        treeTravesal.postOrderTravesal(binaryTree);
        System.out.println("\n \n");
        System.out.println(treeTravesal.heightOfTree(binaryTree));
        System.out.println("\n \n");
    }

}
