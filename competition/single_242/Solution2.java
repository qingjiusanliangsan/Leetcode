package competition.single_242;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-05-23-10:18
 */
public class Solution2 {
    public int minSpeedOnTime(int[] dist, double hour) {
        int ret;
        int n = dist.length;
        if(hour <= (double) n-1){
            return -1;
        }
        Arrays.sort(dist,0,n-2);
        if((int) Math.floor(hour) == n-1){
            dist[n-1]*=100;
            int pkl = (int)Math.ceil(hour *100) - (n-1)*100;
            if(pkl == 0)
                return -1;
            return Math.max(dist[n-2],(int) Math.ceil(dist[n-1]/pkl));
        }
        double totD = 0;
        for(Integer e : dist){
            totD += e;
        }
        double tem;
        int low_s = (int) Math.floor(totD/hour);
        int hig_s = Math.max(dist[n-2],(int) Math.ceil(dist[n-1]/hour-n+1));
        for(ret = low_s;ret<=hig_s;ret++){
//            System.out.println(ret);
            tem = dist[n-1]/ret;
            for(int i=n-2;i>=0;--i){
                if(ret < dist[i]){
                    tem = tem + Math.ceil(dist[i]/ret);
                }
                else{
                    tem = tem + i+1;
                    break;
                }
                System.out.println(tem);
            }
            System.out.println(tem);
            if(tem<=hour){
                return ret;
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,100000};
        double a = 2.01;
        Solution2 s2 = new Solution2();
        System.out.println(s2.minSpeedOnTime(nums,a));
    }
}
