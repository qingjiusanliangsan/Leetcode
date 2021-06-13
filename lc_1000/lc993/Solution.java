package lc_1000.lc993;
/**
 * @author qingjiusanliangsan
 * create 2021-05-17-11:01
 */
public class Solution {
    int flag = 0;
    int[][] tem = new int[2][2];
    int x,y;
    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        make(root,1,0);
        if(tem[0][0]==tem[1][0]&&tem[0][1]!=tem[1][1]){
            return true;
        }
        return false;
    }
    public void make(TreeNode root, int index, int a){
        if(flag<2&&root != null){
            System.out.println(root.val);
            if(root.val==x){
                tem[0][0] = index;
                tem[0][1] = a;
                flag++;
            }
            if(root.val==y){
                tem[1][0] = index;
                tem[1][1] = a;
                flag++;
            }
            make(root.left, index+1,root.val);
            make(root.right, index+1,root.val);
        }
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}