package lc_500.lc179;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qingjiusanliangsan
 * create 2021-04-12-10:49
 */
public class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String ret = "";
        Integer[] Inum = new Integer[n];
        for(int i=0;i<n;i++){
            Inum[i]=nums[i];
        }
        Arrays.sort(Inum,new cmp());

        for(int i=0;i<n;i++){
            ret = ret + String.valueOf(Inum[i]);
        }
        return ret;
    }

}

class cmp implements Comparator<Integer> {
    public int compare(Integer A, Integer B) ///降序排序
    {
        int tema = getLen(A);
        int temb = getLen(B);
        return (A * temb + B) - (B * tema + A);

    }
    public int getLen(int tem){
        int a = tem;
        int ret =1;
        while(tem >0){
            tem = tem/10;
            ret = ret*10;
        }
        return a*ret;
    }
}
