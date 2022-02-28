package competition.single_282;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-02-26-23:49
 */
public class Solution3 {
    public long minimumTime(int[] time, int totalTrips) {
        long m = 0;
        long n = -1;
        long a;
        for(int e: time){
            m = Math.max(e,m);
            n = Math.min(e,n);
        }
        m = m*totalTrips;
        while (n<=m){
            a = n+(m-n)/2;
            int tem_trip = countnum(time,a,totalTrips);
            if(tem_trip<totalTrips){
                n=a+1;
            }
            else {
                m=a-1;
            }
        }
        return n;
    }
    public int countnum(int[] time,long T,int totalTrips){
        int ans=0;
        for(int e: time){
            ans += T/e;
            if(ans >totalTrips){
                return ans;
            }
        }
        return ans;
    }
}