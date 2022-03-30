package lc_1000.lc67;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-22:23
 */
public class Solution {
    public String addBinary(String a, String b) {
        String s;
        if(a.length()<=b.length()){
            s = b;
        }
        else{
            s = a;
            a = b;
        }
        int n = s.length();
        int m = a.length();
        char[] ans = new char[n+1];
        ans[0] = '0';
        int tem = 0;
        int la = m-1,lan=n,ls=n-1;
        while (la>=0){
            tem = tem + s.charAt(ls)-'0'+a.charAt(la)-'0';
            if(tem == 0){
                ans[lan]='0';
                tem = 0;
            }
            else if(tem == 1){
                ans[lan]='1';
                tem = 0;
            }
            else if(tem==2){
                ans[lan] ='0';
                tem=1;
            }
            else {
                ans[lan] ='1';
                tem=1;
            }
            --la;
            --ls;
            --lan;
        }
        while (ls>=0){
            tem = tem + s.charAt(ls)-'0';
            if(tem == 0){
                ans[lan]='0';
                tem = 0;
            }
            else if(tem == 1){
                ans[lan]='1';
                tem = 0;
            }
            else if(tem==2){
                ans[lan] ='0';
                tem=1;
            }
            else {
                ans[lan] ='1';
                tem=1;
            }
            --la;
            --ls;
            --lan;
        }
        if(tem ==1){
            ans[0]='1';
        }
        String res = new String(ans);
        if(ans[0]=='0'){
            return res.substring(1);
        }
        return res.substring(0);
    }
}