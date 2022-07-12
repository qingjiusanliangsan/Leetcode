package Jianzhi.f07;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    HashMap<Integer,Integer> hmap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hmap = new HashMap<>();
        int n = inorder.length;
        for(int i=0;i<n;i++){
            hmap.put(inorder[i],i);
        }
        return make(preorder,inorder,0,n-1,0,n-1);
    }
    public TreeNode make(int[] preorder, int[] inorder,int ps, int pe,int ns, int ne){
        if(ps > pe || ns > ne){
            return null;
        }
        TreeNode root = new TreeNode(preorder[ps]);
        int m = hmap.get(preorder[ps]);
        int le = m-ns;
        root.left = make(preorder,inorder,ps+1,ps+le,ns,m-1);
        root.right = make(preorder,inorder,ps+le+1,pe,m+1,ne);
        return root;
    }
}