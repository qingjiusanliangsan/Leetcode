package lc_500.lc202;

public class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int a = n;
        int b = getnum(n);
        do{
            if(a==1 || b==1){
                return true;
            }
            if(a==b){
                break;
            }
            a = getnum(a);
            b = getnum(b);
            b = getnum(b);
        } while (true);
        return false;
    }
    public int getnum(int n){
        int res = 0;
        while(n>0){
            res +=Math.pow(n%10,2);
            n = n/10;
        }
        return res;
    }
}