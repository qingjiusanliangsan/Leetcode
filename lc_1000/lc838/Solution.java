package lc_1000.lc838;

public class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        char[] st = dominoes.toCharArray();
        int n = st.length;
        char A,B='.';
        for(int i=1;i<n-1;i++){
            if(st[i]=='.'){
                A = st[i-1];
                int a= i;
                int b=i;
                while (b<n-1){
                    if(st[b]!='.'){
                        B=st[b];
                        break;
                    }
                    ++b;
                }
                --b;
                if(A=='R' && B=='L'){
                    i=b;
                    while (a<b){
                        st[a++]='R';
                        st[b--]='L';
                    }
                }
                else if(A=='L' && B=='R'){
                    i = b+1;
                }
                else if(A=='L' && B=='L'){
                    while (i<=b){
                        st[i]='L';
                        ++i;
                    }
                }
                else if(A=='R' && B=='R'){
                    while (i<=b){
                        st[i]='R';
                        ++i;
                    }
                }
            }
        }
        String res = new String(st);
        return res.substring(1,n-1);
    }
}