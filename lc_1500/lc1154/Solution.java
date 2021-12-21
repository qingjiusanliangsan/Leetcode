package lc_1500.lc1154;

public class Solution {
    public int dayOfYear(String date) {
        int y = 1000*(date.charAt(0)-'0')+100*(date.charAt(1)-'0')+10*(date.charAt(2)-'0')+(date.charAt(3)-'0');
        int m = 10*(date.charAt(5)-'0')+(date.charAt(6)-'0');
        int d = 10*(date.charAt(8)-'0')+(date.charAt(9)-'0');
        int[] num = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int res = 0;
        if(y%100==0){
            if(y%400==0){
                num[1]=29;
            }
        }
        else if(y%4==0){
            num[1]=29;
        }
        for(int i=0;i<m-1;i++){
            res+=num[i];
        }
        return res+d;
    }
}