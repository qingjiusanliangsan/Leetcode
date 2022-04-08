package ABhand.sortColl;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr)
    {
        int max=1;
        for(int e: arr){
            max = Math.max(max,String.valueOf(e).length());
        }
        int[] count = new int[arr.length];//count数组用来计数
        int[] bucket = new int[arr.length];//bucket用来当桶（在下面你就理解了什么是桶了），放数据，取数据

        //k表示第几位，1代表个位，2代表十位，3代表百位
        for(int k=1;k<=max;k++) {
            Arrays.fill(count,0);//把count置空，防止上次循环的数据影响
            //分别统计第k位是0,1,2,3,4,5,6,7,8,9的数量
            //即此循环用来统计每个桶中的数据的数量
            for(int i=0;i<arr.length;i++)
            {
                count[getFigure(arr[i],k)]++;
            }
            //利用count[i]来确定放置数据的位置
            for(int i=1;i<arr.length;i++)
            {
                count[i] = count[i] + count[i-1];
            }
            //执行完此循环之后的count[i]就是第i个桶右边界的位置
            //利用循环把数据装入各个桶中，注意是从后往前装
            //这里是重点，一定要仔细理解
            for(int i=arr.length-1;i>=0;i--)
            {
                int j = getFigure(arr[i],k);
                bucket[count[j]-1] = arr[i];
                count[j]--;
            }
            //将桶中的数据取出来，赋值给arr
            for(int i=0,j=0;i<arr.length;i++,j++)
            {
                arr[i] = bucket[j];
            }
        }
    }
    //此函数返回整型数i的第k位是什么
    public static int getFigure(int i,int k)
    {
        int[] a = {1,10,100};
        return (i/a[k-1])%10;
    }
}