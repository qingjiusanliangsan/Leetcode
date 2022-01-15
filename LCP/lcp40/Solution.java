package LCP.lcp40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int maxmiumScore(int[] cards, int cnt) {
        int res=0;
        int n = cards.length;
        List<Integer> num0 = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();
        num0.add(0);
        num1.add(0);
        Arrays.sort(cards);
        int k=n-1;
        while (k>=0){
            if(cards[k]%2==0){
                num0.add(cards[k]+num0.get(num0.size()-1));
            }
            else{
                num1.add(cards[k]+num1.get(num1.size()-1));
            }
            --k;
        }
        int a = 0;
        while (a<=cnt){
            if(cnt-a <num0.size() && a<num1.size()){
                res = Math.max(res,num0.get(cnt-a)+num1.get(a));
            }
            a=a+2;
        }
        return res;
    }
}
