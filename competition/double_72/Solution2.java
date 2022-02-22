package competition.double_72;

/**
 * @author qingjiusanliangsan
 * create 2022-02-19-21:40
 */
public class Solution2 {
    public long[] sumOfThree(long num) {
        long[] ans = new long[3];
        long[] res = new long[0];
        if(num%3==0){
            ans[1]=num/3;
            ans[0]=ans[1]-1;
            ans[2]=ans[1]+1;
            return ans;
        }
        return res;
    }
}