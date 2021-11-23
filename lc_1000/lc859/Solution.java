package lc_1000.lc859;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        int count=0,a=-1,b=-1;
        if(n != m){
            return false;
        }
        if(s.equals(goal)){
            int[] num = new int[26];
            for(int i =0;i<n;i++){
                num[s.charAt(i)-'a']++;
                if(num[s.charAt(i)-'a'] >=2){
                    return true;
                }
            }
        }
        for(int i =0;i<n;i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(count==0){
                    a=i;
                }
                else{
                    b = i;
                }
                ++count;
            }
            if(count >2){
                return false;
            }
        }
        if(count==2 && s.charAt(a) == goal.charAt(b) && s.charAt(b) == goal.charAt(a)){
            return true;
        }
        return false;
    }
}
