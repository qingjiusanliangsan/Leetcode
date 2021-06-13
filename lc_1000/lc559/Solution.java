package lc_1000.lc559;

import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-20:39
 */
public class Solution {
    int ret = 0;
    public int maxDepth(Node root) {
        make(root,0);
        return ret;
    }
    public void make(Node root,int a){
        if(root != null){
            ++a;
            ret = Math.max(ret,a);
            for(Node e: root.children){
                make(e,a);
            }
        }
    }
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
};
