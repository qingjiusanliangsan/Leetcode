package lc_1000.lc838;

public class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
        char[] st = dominoes.toCharArray();
        int n = st.length,a,b;
        char A,B='.';
        for(int i=1;i<n-1;i++){
            if(st[i]=='.'){
                A = st[i-1];
                a= i;
                b=i;
                while (b<n){
                    if(st[b]!='.'){
                        B=st[b];
                        break;
                    }
                    ++b;
                }
                --b;
                if(A=='R' && B=='L'){
                    i = b+1;
                    while (a<b){
                        st[a++]='R';
                        st[b--]='L';
                    }
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
                else{
                    i = b+1;
                }
            }
        }
        String res = new String(st);
        return res.substring(1,n-1);
    }
}