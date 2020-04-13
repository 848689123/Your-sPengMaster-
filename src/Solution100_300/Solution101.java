public class Solution101 {

    static boolean flag =true;

    public static boolean isSymmetric(TreeNode root) {
        if(root==null||(root.right==null&&root.left==null))
            return true;
        if((root.left==null&&root.right!=null)||(root.right==null&&root.left!=null))
            return false;
        bianli(root.left,root.right);
        return flag;
    }

    private static void bianli(TreeNode left, TreeNode right) {
        if(left.left!=null&&right.right!=null)
            bianli(left.left,right.right);
        if(left.right!=null&&right.left!=null)
            bianli(left.right,right.left);
        if(left.val!=right.val)
            flag = false;
        if((left.left==null&&right.right!=null)||(left.right==null&&right.left!=null)||
                (right.left==null&&left.right!=null)||(right.right==null&&left.left!=null))
            flag = false;
    }
}
