package lc_2000.lc2138;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-17:54
 */
public class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder st = new StringBuilder(s);
        while (st.length() %k !=0 ){
            st.append(fill);
        }
        String[] ans = new String[st.length() /k];
        s = st.toString();
        int a = 0;
        while (a<s.length()){
            ans[a/k]=s.substring(a,a+k);
            a+=k;
        }
        return ans;
    }
}
