package Solution400_500;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution429 {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if(root==null)
            return null;
        int depth = 0;
        list.add(new ArrayList<Integer>());
        bianli(depth,root);
        Collections.reverse(list);
        return list;
    }

    private void bianli(int depth, Node root) {
        for(int i=0;i<root.children.size();i++){
            if(list.size()==depth+1)
                list.add(new ArrayList<>());
            bianli(depth+1,root.children.get(i));
        }
        list.get(depth).add(root.val);
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
