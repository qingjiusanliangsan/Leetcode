package hot100.lc42;

/**
 * @author qingjiusanliangsan
 * create 2022-05-14-17:45
 */
public class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] Le = new int[n];
        int lmin,ans=0,tem = height[0];;
        for(int i=0;i<n;i++){
            if(height[i] > tem){
                tem = height[i];
            }
            Le[i] = tem;
        }
        tem = height[n-1];
        for(int i=n-1;i>=0;i--){
            if(height[i] > tem){
                tem = height[i];
            }
            lmin = Math.min(Le[i],tem);
            if(lmin > height[i]){
                ans += lmin - height[i];
            }
        }
        return ans;
    }
}