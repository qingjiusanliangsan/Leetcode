package ABhand;

import java.util.Arrays;
// https://www.cnblogs.com/onepixel/articles/7674659.html
public class SortSet {
    public static void main(String[] args) {
        int[] num = {8,9,2,10,3,1,43,2,65,79};
        System.out.println(Arrays.toString(num));
//        SortSet.bubblesort(num);
//        SortSet.selectsort(num);
//        SortSet.inserttsort(num);
        SortSet.shellsort(num);
        System.out.println(Arrays.toString(num));
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
