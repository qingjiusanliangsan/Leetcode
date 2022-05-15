package lc_1000.lc912;


import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-05-04-19:54
 */
public class Solution {
    public static int[] sortArray(int[] nums) {
//        quickSort(nums,0,nums.length-1);
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static void quickSort(int[] nums,int a, int b){
        if(a>=b || a<0 || b>=nums.length){
            return;
        }
        int k = a+1;
        int tem;
        for(int i=a+1;i<=b;i++){
            if(nums[i]<nums[a]){
                tem = nums[i];
                nums[i] = nums[k];
                nums[k] = tem;
                ++k;
            }
        }
        tem = nums[k-1];
        nums[k-1] = nums[a];
        nums[a] = tem;
        quickSort(nums,a,k-2);
        quickSort(nums,k,b);
    }
    public static void main(String[] args) {
        Solution.sortArray(new int[]{5,4,3});
    }
    /*
    * 建堆：从n/2处开始建；
    * 将第一个和后边的交换，重新建堆；
    * */
    public static void heapSort(int[] nums){
        int n = nums.length-1;
        buildHeap(nums);
        for(int i=n;i>0;i--){
            swp(nums,0,i);
            maxHeapify(nums,0,i-1);
        }
    }
    public static void buildHeap(int[] num){
        int n = num.length;
        for(int i=n/2;i>=0;i--){
            maxHeapify(num,i,n-1);
        }
    }
    public static void maxHeapify(int[] nums, int i, int len){
        while (i*2+1<=len){
            int lson = i*2+1;
            int rson = i*2+2;
            int larg=i;
            if(lson<=len && nums[i]<nums[lson]){
                larg=lson;
            }
            if(rson<=len && nums[larg]<nums[rson]){
                larg = rson;
            }
            if(i!=larg){
                swp(nums,i,larg);
                i = larg;
            }
            else{
                break;
            }
        }
    }
    public static void swp(int[] nums,int a,int b){
        int tem = nums[a];
        nums[a] = nums[b];
        nums[b] = tem;
    }

}