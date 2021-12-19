package lc_1000.lc917;

/**
 * @author qingjiusanliangsan
 * create 2021-12-19-23:37
 */
public class Solution {
    public String reverseOnlyLetters(String s) {
        char[] st = s.toCharArray();
        int n = s.length();
        int a=0,b=n-1;
        char tem;
        while (a<b){
            if(st[a]>='a' && st[a]<='z' || st[a]>='A' && st[a]<='Z'){

            }
            else{
                ++a;
                continue;
            }
            if(st[b]>='a' && st[b]<='z' || st[b]>='A' && st[b]<='Z'){

            }
            else{
                --b;
                continue;
            }
            tem = st[a];
            st[a]=st[b];
            st[b]=tem;
            ++a;
            --b;
        }

        return new String(st);
    }
}
