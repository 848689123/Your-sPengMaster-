public class Soultion110 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);
        p.left.left = new TreeNode(15);
//        p.left.right = new TreeNode(7);
        p.left.left.left = new TreeNode(4);
//        p.left.left.right = new TreeNode(4);
//        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);
        p.right.right.right = new TreeNode(1);
//        TreeNode p = null;
        System.out.println(isBalanced(p));
    }

    static boolean flag = true;
    public static boolean isBalanced(TreeNode root) {
        height(root);
        return flag;
    }
    private static int height(TreeNode root) {
        if(root==null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left-right)>1)
            flag = false;
        return Math.max(left,right)+1;
    }
}
