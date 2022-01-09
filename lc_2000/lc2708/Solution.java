package lc_2000.lc2708;

/**
 * @author qingjiusanliangsan
 * create 2022-01-09-17:28
 */
public class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(i>0 && colors[i]==colors[i-1]){
                continue;
            }
            for(int j=n-1;j>i+res;--j){
                if(colors[i]!=colors[j]){
                    res = Math.max(res,j-i);
                    break;
                }
            }
        }
        return res;
    }
}
