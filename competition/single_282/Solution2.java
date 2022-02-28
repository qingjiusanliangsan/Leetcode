package competition.single_282;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2022-02-26-23:49
 */
public class Solution2 {
    public int minSteps(String s, String t) {
        int[] num = new int[26];
        Arrays.fill(num,0);
        int n = s.length();
        int m = t.length();
        int ans = 0;
        for(int i=0;i<n;++i){
            ++num[s.charAt(i)-'a'];
        }
        for(int i=0;i<m;++i){
            --num[t.charAt(i)-'a'];
        }
        for(int e: num){
            ans+=Math.abs(e);
        }
        return ans;
    }
}
