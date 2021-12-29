package lc_1000.lc881;

import java.util.Arrays;

public class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int b=people.length-1,a=0;
        int res = 0;
        while (a<=b){
            if(people[b]+people[a]<=limit){
                ++a;
            }
            --b;
            ++res;
        }
        return res;
    }
}