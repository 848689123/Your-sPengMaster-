package Solution500_600;

public class Solution530 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(2236);
        root.right.left = new TreeNode(1277);
        root.right.right = new TreeNode(2776);
        root.right.left.left = new TreeNode(519);
        System.out.println(getMinimumDifference(root));
    }

    static int min = Integer.MAX_VALUE;

    public static int getMinimumDifference(TreeNode root) {
        TreeNode leftChild = root.left;
        TreeNode rightChild = root.right;
        if(leftChild != null){
            int leftChildVal = leftChild.val;
            getMinimumDifference(leftChild);
            leftChildVal = findNextRightNode(leftChild.right) == -1 ? leftChildVal : findNextRightNode(leftChild.right);
            min = min < root.val - leftChildVal ? min : root.val - leftChildVal;
        }
        if(rightChild != null){
            int rightChildVal = rightChild.val;
            getMinimumDifference(rightChild);
            rightChildVal = findNextLeftNode(rightChild.left) == -1 ? rightChildVal : findNextLeftNode(rightChild.left);
            min = min < rightChildVal - root.val ? min : rightChildVal - root.val;
        }
        return min;
    }

    private static int findNextLeftNode(TreeNode left) {
        if(left == null)   return -1;
        while (left.left != null)
            left = left.left;
        return left.val;
    }

    private static int findNextRightNode(TreeNode right) {
        if(right == null)   return -1;
        while (right.right != null)
            right = right.right;
        return right.val;
    }

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) {val = x;}
}
