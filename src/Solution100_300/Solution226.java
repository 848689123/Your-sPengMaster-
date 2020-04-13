package Solution100_300;

public class Solution226 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root==null)  return root;
        invert(root);
        return root;
    }

    private static void invert(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        boolean flag = false;
        if(left!=null&&right==null){
            flag = true;
            invert(left);
            root.right = root.left;
            root.left = null;
        }
        if(right!=null&&left==null&&flag==false){
            invert(right);
            root.left = root.right;
            root.right = null;
        }
        if(left!=null&&right!=null){
            invert(left);
            invert(right);
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }

//    private static void invert(TreeNode left, TreeNode right) {
//        boolean flag = false;
//        if(left!=null&&right==null){
//            flag = true;
//            invert(left.left,left.right);
//            right = left;
//            left = null;
//        }
//        if(right!=null&&left==null&&flag==true){
//            invert(right.left,right.right);
//            left = right;
//            right = null;
//        }
//        if(left!=null&&right!=null){
//            invert(left.left,left.right);
//            invert(right.left,right.right);
//            TreeNode temp = left;
//            left = right;
//            right = temp;
//        }
//    }
}




