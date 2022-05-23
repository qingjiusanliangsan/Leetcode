package lc_1000.lc84;

import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-05-23-19:39
 */
public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return heights[0];
        }
        int res = 0;
        int[] nums = new int[n+2];
        Stack<Integer> stack = new Stack<>();
        System.arraycopy(heights,0,nums,1,n);
        stack.add(0);
        for(int i=1;i<=n+1;i++){
            while (nums[i] < nums[stack.peek()]){
                int h = nums[stack.pop()];
                int w = i-stack.peek()-1;
                res = Math.max(res,w*h);
            }
            stack.add(i);
        }
        return res;
    }
}