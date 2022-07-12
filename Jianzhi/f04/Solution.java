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
}