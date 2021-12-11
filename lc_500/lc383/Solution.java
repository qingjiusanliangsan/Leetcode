package lc_500.lc383;

import java.util.Arrays;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] num = new int[26];
        Arrays.fill(num,0);
        int n = ransomNote.length();
        int m = magazine.length();
        if(n>m){
            return false;
        }
        for(int i=0;i<m;i++){
            num[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(num[ransomNote.charAt(i)-'a']<=0){
                return false;
            }
            num[ransomNote.charAt(i)-'a']--;
        }
        return true;
    }
}