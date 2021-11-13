package lc_1000.lc520;

/**
 * @author qingjiusanliangsan
 * create 2021-11-13-16:33
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if(n==1){
            return true;
        }
        int flag,i=0;
        if(Character.isUpperCase(word.charAt(0))){

            if(Character.isUpperCase(word.charAt(1))){
                flag = 1;
            }
            else {
                flag = 0;
            }
            i=2;
        }
        else{
            flag = 0;
            i = 1;
        }
        for(;i<n;i++){
            if(flag == 0){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            else{
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
