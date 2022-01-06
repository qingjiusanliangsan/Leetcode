package lc_1000.lc507;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        int m = (int)Math.sqrt(num)+1;
        int res = 1,a=2;
        while (a<m){
            if(num %a==0){
                res+=a;
                int b = num/a;
                if(a != b){
                    res+=b;
                }
            }
            if(res>num){
                return false;
            }
            ++a;
        }
        if(res==num){
            return true;
        }
        return false;
    }
}
