package LcOther.Interface.lc0106;

public class Solution {
    public String compressString(String S) {
        StringBuilder st = new StringBuilder();
        int n = S.length();
        if(n==0){
            return S;
        }
        char tem=S.charAt(0);
        int k=0;
        for(int i=0;i<n;i++){
            if(S.charAt(i)==tem){
                ++k;
            }
            else{
                st.append(tem);
                st.append(k);
                tem = S.charAt(i);
                k=1;
            }
        }
        st.append(tem);
        st.append(k);
        if(st.length() < n){
            return new String(st);
        }
        return S;
    }
}