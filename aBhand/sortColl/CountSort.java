package aBhand.sortColl;

/**
 * @author qingjiusanliangsan
 * create 2022-04-07-23:36
 */
public class CountSort {
    public static void countingSort(int[] num){
        int maxv = Integer.MIN_VALUE;
        int minv = Integer.MAX_VALUE;
        for(int e:num){
            maxv = Math.max(e,maxv);
            minv = Math.min(e,minv);
        }
        int[] count = new int[maxv-minv+1];
        for(int e:num){
            count[e-minv]++;
        }
        int s = 0;
        for(int i=0;i<count.length;++i){
            while (count[i]>0){
                num[s++] = i+minv;
                count[i]--;
            }
        }
    }
}