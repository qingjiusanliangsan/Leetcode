package lc_1500.lc1170;

import java.util.Arrays;

public class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n=queries.length,m=words.length;
        int[] res = new int[n];
        int[] fqu = makef(n,queries);
        int[] fwo = makef(m,words);
        Arrays.sort(fwo);
        System.out.println(Arrays.toString(fqu));
        System.out.println(Arrays.toString(fwo));
        for(int i=0;i<n;i++){
            int a=0,b=m-1,ans=m,c,k=fqu[i];
            while(a<=b){
                c=(b-a)/2+a;
                if(fwo[c]>k){
                    ans = c;
                    b = c-1;
                }
                else{
                    a = c+1;
                }
            }
            res[i] = m-ans;
        }
        return res;
    }
    public int[] makef(int n,String[] queries){
        int[] fqu = new int[n];
        for(int i=0;i<n;i++){
            int con=0,mlen=26;
            for(int j=0;j<queries[i].length();j++){
                int a = queries[i].charAt(j)-'a';
                if(a==mlen){
                    con++;
                }
                else if(a<mlen){
                    mlen = a;
                    con = 1;
                }
            }
            fqu[i] = con;
        }
        return fqu;
    }
}