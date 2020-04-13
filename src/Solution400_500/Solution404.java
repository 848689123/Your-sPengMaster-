package Solution400_500;

public class Solution404 {
    int result = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left!=null&&root.left.left==null&&root.left.right==null)
            result += root.left.val;
        else if(root.left!=null)
            sumOfLeftLeaves(root.left);
        if(root.right!=null)
            sumOfLeftLeaves(root.right);
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
