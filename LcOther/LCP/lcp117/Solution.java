package LcOther.LCP.lcp117;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-18:08
 */
public class Solution {
    public int calculate(String s) {
        int x=1,y=0;
        int n = s.length();
        for(int i=0;i<n;++i){
            if(s.charAt(i)=='A'){
                x = 2*x+y;
            }
            else{
                y = 2*y+x;
            }
        }
        return x+y;
    }
}
