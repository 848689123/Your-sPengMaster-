public class Solution100 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(0);
        TreeNode q = new TreeNode(0);
        System.out.println(isSameTree(p,q));
    }
    static boolean f = true;
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if((p==null&&q!=null)||(p!=null&&q==null))
            return false;
        bianli(p,q);
        return f;
    }

    private static void bianli(TreeNode p, TreeNode q) {
        if(p.left!=null&&q.left!=null&&p.val==q.val)
            bianli(p.left,q.left);
        if(p.right!=null&&q.right!=null&&p.val==q.val)
            bianli(p.right,q.right);
        if(p.right==null&&q.right!=null)
            f = false;
        if(p.left==null&&q.left!=null)
            f = false;
        if(p.left!=null&&q.left==null)
            f = false;
        if(p.right!=null&&q.right==null)
            f = false;
        if(p.val!=q.val)
            f = false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
