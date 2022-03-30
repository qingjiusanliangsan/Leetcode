package lc_1000.lc167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int n = numbers.length;
        int tem;
        tem = find(numbers,1,n-1,target-numbers[0]);
        if(tem != -1){
            return new int[]{1,tem+1};
        }
        for(int i =1; i<n; i++){
            if(numbers[i] != numbers[i-1]){
                tem = find(numbers,i+1,n-1,target-numbers[i]);
                if(tem != -1){
                    return new int[]{i+1,tem+1};
                }
            }
        }
        return ret;
    }
    public int find(int[] numbers, int a, int b, int target){
        while(a <= b){
            int c = (b-a)/2 + a;
            if(numbers[c] == target){
                return c;
            }
            else if(numbers[c] < target){
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return -1;
    }
}
