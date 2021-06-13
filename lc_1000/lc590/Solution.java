package lc_1000.lc590;

import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-20:02
 */
public class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        Stack<Node> Nst = new Stack<>();
        Nst.push(root);
        while(!Nst.empty()){
            Node tem = Nst.pop();
            if(tem != null){
                res.add(tem.val);
                for(Node e : tem.children){
                    Nst.push(e);
                }
            }

        }
        Collections.reverse(res);
        return res;
    }
    public void make(Node root){
        if(root != null){
            for(Node e : root.children){
                make(e);
            }
            res.add(root.val);
        }
    }
//    public void lastm(Node root){
//        for(Node e : root.children)
//    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}