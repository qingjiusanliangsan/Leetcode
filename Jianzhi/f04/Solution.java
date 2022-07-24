package Jianzhi.f04;


public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if(n==0){
            return false;
        }
        int m = matrix[0].length;
        if(m==0){
            return false;
        }
        boolean ret = false;
        for(int[] tem : matrix){
            if(target < tem[0]){
                return false;
            }
            else if(target > tem[m-1]){
                continue;
            }
            else if(target >= tem[0] && target <= tem[m-1]){
                ret = find(tem,target);
            }
            if(ret == true){
                return  ret;
            }

        }
        return ret;
    }
    public boolean find(int[] arr,int tar){
        int n = arr.length;
        int a = 0;
        int b =n-1;
        while (a<=b){
            int c = (b-a)/2 + a;
            if(arr[c]==tar){
                return true;
            }
            else if(arr[c] < tar){
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        try{
//            System.out.println("try-");
//            int[] a = new int[0];
//            a[0]=1;
//            System.out.println(a[0]+"-");
//        }
//        catch (Exception e){
//            System.out.println("catch-");
//        }
//        finally {
//            System.out.println("finally-");
//        }
        String s1 = "ZhongWang";
        String s2 = "RuanJian";
        String s3 = s1+s2;
        String s4 = "ZhongWang" + "RuanJian";
        String s5 = "ZhongWangRuanJian";
        String s6 = s1 + new String("RuanJian");
        String s7 = new String("ZhongWang") + new String("RuanJian");
        String s8 = s7.intern();
        System.out.println(s3==s4);
        System.out.println(s4==s5);
        System.out.println(s5==s6);
        System.out.println(s5==s7);
        System.out.println(s5==s8);
    }
}