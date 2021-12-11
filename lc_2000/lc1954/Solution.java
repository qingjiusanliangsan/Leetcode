package lc_2000.lc1954;

public class Solution {
    public long minimumPerimeter(long neededApples) {

        long n=0;
        long sum = 0;
        long left = 0,right = 100000;
        while(left<right){
            n = (left+right)/2;
            //n和sum 都要声明为long类型，不然这里计算会出溢出
            sum = ((1+n)*n)*(n*2+1)*2;
            if(sum<neededApples){
                left = n+1;
            }else if(sum>neededApples){
                right = n;
            }else{
                return n*8;
            }
        }
        return right*8;
    }
}