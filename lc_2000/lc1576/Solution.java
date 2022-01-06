package lc_2000.lc1576;

public class Solution {
    public String modifyString(String s) {
        int n = s.length(),a=0;
        char[] st = new char[n+2];
        st[0] = 'a';
        st[n+1]='z';
        for(int i=0;i<n;i++){
            st[i+1]=s.charAt(i);
        }
        for(int i=1;i<=n;i++){
            if(st[i]=='?'){
                char tem = (char)('a'+a);
                while (tem == st[i-1] || tem == st[i+1]){
                    ++a;
                    a=a%26;
                    tem = (char)('a'+a);
                }
                st[i] = tem;
            }
        }
        String res = new String(st);
        return res.substring(1,n+1);
    }
}