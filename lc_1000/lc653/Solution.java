package lc_1000.lc653;

import ALib.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qingjiusanliangsan
 * create 2021-05-22-17:08
 */
public class Solution {
    Map<Integer,Integer> temS = new HashMap<>();
    public boolean findTarget(TreeNode root, int k) {
        make(root,k);
        for(Integer e : temS.keySet()){
            int p = k - e;
            if(temS.get(p) == null){
                continue;
            }
            else{
                int a = temS.get(p);
                if(p==e&&a<2)
                    continue;
                return true;
            }
        }
        return false;
    }
    public void make(TreeNode root, int k){
        if(root != null){
            if(root.val < k){
                if(temS.get(root.val) == null){
                    temS.put(root.val,1);
                }
                else{
                    temS.put(root.val,temS.get(root.val)+1);
                }
                make(root.left,k);
                make(root.right,k);
            }
            else{
                make(root.left,k);
            }
        }
    }
}
