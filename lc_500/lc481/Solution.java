package lc_500.lc481;

public class Solution {
    public int magicalString(int n) {
        if(n<=3){
            return 1;
        }
        int res=1;
        int a=1,b=1;
        int[] num = new int[n+1];
        num[0]=1;
        num[1]=2;
        while (b<n){
            if(num[a]==1){
                num[b] = (2/num[b-1]);
                b++;
                ++res;
            }
            else{
                num[b] = (2/num[b-1]);
                b++;
                num[b] = (2/num[b-2]);
                b++;
            }
            ++a;
        }
        while (a<n){
            if(num[a]==1){
                ++res;
            }
            ++a;
        }
        return res;
    }
}