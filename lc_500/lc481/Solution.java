package lc_500.lc481;


import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int magicalString(int n) {
        if(n==1){
            return 1;
        }
        int res=0;
        int a=1,b=2,las=1,now;
        Queue<Integer> Lnum = new ArrayDeque<>();
        Lnum.add(1);
        Lnum.add(2);
        while (b<n){
            now=Lnum.poll();
            Lnum.add(2/las);
            if(now==1){
                ++res;
            }
            else{
                Lnum.add(2/las);
                ++b;
            }
            las = 2/las;
            ++a;
            ++b;
        }
        while (!Lnum.isEmpty()){
            now=Lnum.poll();
            if(now==1){
                ++res;
            }
        }
        return res;
    }
    public int magicalString1(int n) {
        if(n==1){
            return 1;
        }
        int res=1;
        int a=1,b=1;
        int[] num = new int[n+1];
        num[0]=1;
        num[1]=2;
        while (b<n){
            if(num[a]==1){
                ++res;
                num[b] = (2/num[b-1]);
                b++;
            }
            else if(num[a]==2){
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
