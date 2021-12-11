package lc_1000.lc748;

import java.util.Arrays;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lic = new int[26];
        int[] num = new int[26];
        int n= words.length,k=0;
        String ret="";
        int max_len = Integer.MAX_VALUE;
        for(int i=0;i<licensePlate.length();i++){
            char cl = licensePlate.charAt(i);
            if(cl>='a' && cl<='z'){
                lic[cl-'a']++;
                k++;
            }
            else if(cl>='A' && cl<='Z'){
                lic[cl-'A']++;
                k++;
            }
        }
        for(int i=0;i<n;i++){
            Arrays.fill(num,0);
            int flag = 1;
            if(words[i].length()>=k){
                for(int j=0;j<words[i].length();j++){
                    num[words[i].charAt(j)-'a']++;
                }
                for(int p=0;p<26;p++){
                    if(lic[p]>num[p]){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    if(words[i].length()<max_len){
                        ret = words[i];
                        max_len = words[i].length();
                    }
                }
            }
        }
        return ret;
    }
}
