package lc_500.lc397;

import java.util.LinkedList;
import java.util.Queue;
//2147483647
public class Solution {
    public int integerReplacement(int n) {
        if(n==1){
            return 0;
        }
        if(n%2 == 0){
            return integerReplacement(n/2)+1;
        }
        else{
            return Math.min(integerReplacement(n/2+1),integerReplacement(n/2))+2;
        }
    }
}

