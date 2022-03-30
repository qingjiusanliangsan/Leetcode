package lc_1000.lc299;

public class Solution {
    public String getHint(String secret, String guess) {
        int[] num_s = new int[10];
        int[] num_g = new int[10];
        int a=0,b=0;
        int n = secret.length();
        for(int i=0;i<n;i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g){
                a++;
            }
            else{
                num_s[s - '0']++;
                num_g[g - '0']++;
            }
        }
        for(int i=0;i<10;i++){
            b += Math.min(num_s[i],num_g[i]);
        }
        return String.valueOf(a)+"A"+String.valueOf(b)+"B";
    }
}
