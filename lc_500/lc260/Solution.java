package lc_500.lc260;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        if(n==2){
            return nums;
        }

        /**        method1        **/
//        int[] ret = new int[2];
//        Set<Integer> tems = new HashSet<>();
//        for(int i=0;i<n;i++){
//            if(tems.contains(nums[i])){
//                tems.remove(nums[i]);
//            } else{
//                tems.add(nums[i]);
//            }
//        }
//        int k=0;
//        Iterator<Integer> it = tems.iterator();
//        while(it.hasNext()){
//            ret[k++] = it.next();
//        }
//        return ret;

        /**        method2        **/
        int a = nums[0];
        for(int i=1;i<n;i++){
            a = a ^ nums[i];
        }
        int lsb = (a == Integer.MIN_VALUE ? a : a & (-a));
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lsb) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1, type2};
    }

    public static void main(String[] args) {
        class Value
        {
            int i;
        }
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));//（1）flase
        System.out.println(v1 == v2);//（2）false

        int a = 30;
        System.out.println(Integer.toBinaryString(a));
        //使用位运算 x&-x 取出 x 的二进制表示中最低位那个 1，设其为第 l 位;
        System.out.println(a & -a);

    }
}
