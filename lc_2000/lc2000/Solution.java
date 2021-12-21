package lc_2000.lc2000;

public class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length(),d=-1;
        char[] st = word.toCharArray();
        for(int i=0;i<n;i++){
            if(st[i]==ch){
                d=i;
                break;
            }
        }
        if(d==-1){
            return word;
        }
        int a=0;
        char tem;
        while(a<d){
            tem=st[a];
            st[a] = st[d];
            st[d] = tem;
            ++a;
            --d;
        }
        return new String(st);
    }
}