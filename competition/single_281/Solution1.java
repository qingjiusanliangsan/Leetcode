package competition.single_281;

/**
 * @author qingjiusanliangsan
 * create 2022-02-20-10:16
 */
public class Solution1 {
    public int countEven(int num) {
        int i=2,ans=0;
        while (i<=num){
            if(make(i)%2==0){
                ++ans;
            }
            ++i;
        }
        return ans;
    }
    public int make(int ele){
        int ans = 0;
        while (ele>0){
            ans = ans +ele%10;
            ele = ele/10;
        }
        return ans;
    }
}
