package Solution100_300;

public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int currVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if(pVal>currVal&&qVal>currVal){
            return lowestCommonAncestor(root.right,p,q);
        } else if(pVal<currVal&&qVal<currVal){
            return lowestCommonAncestor(root.left,p,q);
        } else {
            return root;
        }
    }
}
