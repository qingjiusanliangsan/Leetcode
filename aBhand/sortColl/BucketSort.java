package aBhand.sortColl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] num = {8,9,2,10,3,1,43,2,65,79};
        System.out.println(Arrays.toString(num));
        BucketSort.bucketsort(num,5);
        System.out.println(Arrays.toString(num));
    }
    public static void bucketsort(int[] num,int bucketSize){
        int n = num.length;
        int defaultBucketSize = 5;
        bucketSize = Math.max(bucketSize,defaultBucketSize);
        int maxv = Integer.MIN_VALUE;
        int minv = Integer.MAX_VALUE;
        for(int e:num){
            maxv = Math.max(e,maxv);
            minv = Math.min(e,minv);
        }
        int bucketCount = (int)Math.floor((maxv - minv) / bucketSize) + 1;
        ArrayList<ArrayList<Integer>> Buck = new ArrayList<>(bucketCount);
        for(int i=0;i<bucketCount;++i){
            Buck.add(new ArrayList<Integer>());
        }
        for(int e:num){
            int k = (e-minv)/bucketSize;
            Buck.get(k).add(e);
        }
        int k=0;
        for (int i=0;i<Buck.size();++i){
            Collections.sort(Buck.get(i));
            for(int e:Buck.get(i)){
                if(k<n){
                    num[k++]=e;
                }
            }
        }
    }
}
