package hot100.lc739;

import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-05-14-11:47
 * 判别是否需要使用单调栈，如果需要找到左边或者右边第一个比当前位置的数大或者小，则可以考虑使用单调栈；单调栈的题目如矩形米面积等等
 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stac = new Stack<>();
        for(int i=0;i<n;i++){
            while (stac.isEmpty() && temperatures[i]>temperatures[stac.peek()]){
                int z = stac.pop();
                res[z] = i-z;
            }
            stac.push(i);
        }
        return res;
    }
}