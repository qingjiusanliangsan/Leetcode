package lc_1000.lc567;


public class Solution {
    public boolean cmp(String s1,int[] tem){
        for(int i= 0;i<s1.length();i++) {
            if(tem[s1.charAt(i) - 'a']!=0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean ret = false;
        int n = s2.length();
        int k = s1.length();
        if(k>n){
            return false;
        }
        int[] index = new int[26];
        for(int i= 0;i<26;i++){
            index[i] =0;
        }
        // for(int i= 0;i<k;i++){
        //     index[s1.charAt(i) - 'a'] =1;
        // }
        for(int i= 0;i<k;i++){
            index[s1.charAt(i) - 'a'] +=1;
        }
        for(int i= 0;i<k;i++){
            index[s2.charAt(i) - 'a'] --;
        }
        // System.out.println(Arrays.toString(index));
        if(cmp(s1,index)){
            return true;
        }
        for(int i= k;i<n;i++){
            index[s2.charAt(i-k) - 'a']++;
            index[s2.charAt(i) - 'a']--;
            // System.out.println(Arrays.toString(index));
            if(cmp(s1,index)){
                return true;
            }
        }
        return false;
    }
}
