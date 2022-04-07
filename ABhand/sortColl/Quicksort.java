package ABhand.sortColl;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] num = {8,9,2,10,3,1,43,2,65,79};
        System.out.println(Arrays.toString(num));
//        SortSet.bubblesort(num);
//        SortSet.selectsort(num);
//        SortSet.inserttsort(num);
//        SortSet.shellsort(num);
//        SortSet.mergesort(num,0,num.length-1);
        Quicksort.quicksort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
    public static void quicksort(int[] num,int a,int b){
        if(a>=b){
            return;
        }
        int t = a+1;
        int tem;
        for(int i=t;i<=b;++i){
            if(num[i] < num[a]){
                tem = num[i];
                num[i] = num[t];
                num[t] = tem;
                ++t;
            }
        }
        tem = num[t-1];
        num[t-1] = num[a];
        num[a] = tem;
        quicksort(num,a,t-2);
        quicksort(num,t,b);
        return;
    }
}
