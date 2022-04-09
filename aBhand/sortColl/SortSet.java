package aBhand.sortColl;

import java.util.Arrays;
// https://www.cnblogs.com/onepixel/articles/7674659.html
public class SortSet {
    public static void main(String[] args) {
        int[] num = {8,9,65,79,2,10,3,1,43,2};
        System.out.println(Arrays.toString(num));
//        SortSet.bubblesort(num);
//        SortSet.selectsort(num);
//        SortSet.inserttsort(num);
//        SortSet.shellsort(num);
//        SortSet.mergesort(num,0,num.length-1);
//        Quicksort.quicksort(num,0,num.length-1);
//        HeapSort.heapSort(num);
//        CountSort.countingSort(num);
//        BucketSort.bucketsort(num,5);
        RadixSort.radixSort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void mergesort(int[] num,int a,int b){
        if(a==b){
            return;
        }
        int c = a+(b-a)/2;
        mergesort(num,a,c);
        mergesort(num,c+1,b);
        merge(num,a,c,b);
        return;
    }
    public static void merge(int[] num,int a,int c,int b){
        int s = a;
        int[] tem = new int[b-a+1];
        int pre = 0;
        int d = c+1;
        while (a<=c && d<=b){
            if(num[a]<=num[d]){
                tem[pre] = num[a];
                a++;
            }
            else{
                tem[pre] = num[d];
                d++;
            }
            ++pre;
        }
        while (a<=c){
            tem[pre++] = num[a++];
        }
        while (d<=b){
            tem[pre++] = num[d++];
        }
        for(int i=0;i<pre;++i){
            num[s] = tem[i];
            ++s;
        }
        return;
    }
    public static void shellsort(int[] num){
        int n = num.length;
        for(int gap = (int)Math.floor(n/2);gap>0;gap = (int)Math.floor(gap/2)){
            for(int i=gap; i< n;++i){
                int j=i;
                int curval = num[i];
                while (j-gap >=0 && curval <num[j-gap]){
                    num[j] = num[j-gap];
                    j = j-gap;
                }
                num[j] = curval;
            }
        }
    }
    public static void inserttsort(int[] num){
        int n = num.length;
        int pre,curval;
        for(int i=1;i<n;++i){
            pre = i-1;
            curval = num[i];
            while (pre>=0 && num[pre] > curval){
                num[pre+1] = num[pre];
                --pre;
            }
            num[pre+1] = curval;
        }
    }
    public static void selectsort(int[] num){
        int n = num.length;
        int index,a;
        for(int i=0;i<n;++i){
            a = num[i];
            index = i;
            for(int j=i+1;j<n;j++){
                if(num[j]<a){
                    a = num[j];
                    index=j;
                }
            }
            num[index] = num[i];
            num[i] =a;
        }
    }
    public static void bubblesort(int[] num){
        int n = num.length;
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i-1;++j){
                if(num[j]>num[j+1]){
                    int tem = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tem;
                }
            }
        }
    }

}
