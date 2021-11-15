package lc_1000.lc744;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a=0,b=letters.length-1,res=0,c;
        while(a<=b){
            c = (b-a)/2 + a;
            if(letters[c] > target){
                res = c;
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        return letters[res];
    }
}
