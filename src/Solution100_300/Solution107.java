import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution107 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        p.left = new TreeNode(9);
        p.right = new TreeNode(20);
        p.right.left = new TreeNode(15);
        p.right.right = new TreeNode(7);
        System.out.println(levelOrderBottom(p));
    }

    static List<List<Integer>> list = new ArrayList();
    
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return list;
        int depth = 0;
        list.add(new ArrayList<Integer>());
        bianli(depth,root);
        Collections.reverse(list);
        return list;
    }

    private static void bianli(int depth, TreeNode root) {
        if(root.left!=null){
            if(list.size()==depth+1)
                list.add(new ArrayList<>());
            bianli(depth+1,root.left);
        }
        if(root.right!=null){
            if(list.size()==depth+1) {
                list.add(new ArrayList<>());
            }
            bianli(depth+1,root.right);
        }
            list.get(depth).add(root.val);
    }
}
