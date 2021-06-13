package lc_1000.lc503;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        if(n==0){
            return nums;
        }
        int[] ret = new int[n];
        int m = nums[0];
        for(int i=1;i<n;i++){
            m = Math.max(m,nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]==m){
                ret[i] = -1;
                continue;
            }
            for(int k=1;k<n;k++){
                int j =(i+k)%n;
                if(nums[j]>nums[i]){
                    ret[i] = nums[j];
                    break;
                }
            }
        }
        return ret;
    }
}
//class Slution {
//    public int[] nextGreaterElements(int[] nums) {
//        int n = nums.length;
//        int[] ret = new int[n];
//        Arrays.fill(ret, -1);
//        Deque<Integer> stack = new LinkedList<Integer>();
//        for (int i = 0; i < n * 2 - 1; i++) {
//            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
//                ret[stack.pop()] = nums[i % n];
//            }
//            stack.push(i % n);
//        }
//        return ret;
//    }
//}

