package Jianzhi.f50;

/**
 * @author qingjiusanliangsan
 * create 2022-07-30-11:32
 */
public class Solution {
    public char firstUniqChar(String s) {
        int[] num = new int[26];
        if(s.length()==0){
            return ' ';
        }
        for(int i=0;i<s.length();i++){
            if(num[s.charAt(i)-'a']==0){
                num[s.charAt(i)-'a']=i+1;
            }
            else{
                num[s.charAt(i)-'a']=-1;
            }
        }
        int ans = s.length()+1;
        for(int i=0;i<26;i++){
            if(num[i]>0){
                ans = Math.min(ans,num[i]);
            }
        }
        if(ans<=s.length()){
            return s.charAt(ans-1);
        }
        return ' ';
    }
}