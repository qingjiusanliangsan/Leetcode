package LCP.lcp18;


import java.util.Arrays;
/**
 * @author qingjiusanliangsan
 * create 2021-11-13-19:48
 */
public class Solution {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int ret=0,a,b=0;
        for(int e:drinks){
            b = Math.max(b,e);
        }
        int[] numb = new int[b+1];
        for(int e:drinks){
            numb[e]++;
        }
        for(int i=1;i<=b;i++){
            numb[i] +=numb[i-1];
        }
        for(int e:staple){
            a =x-e;
            a = Math.min(a,b);
            if(a>=0){
                ret = ret+numb[a];
                ret = ret % 1000000007;
            }

        }
        return ret;
    }
    /*public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int ret = 0;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        for(int e:staple){
            if(e<=x){
                ret = ret + find(drinks,x-e) + 1;
                ret = ret % 1000000007;
            }
        }

        return ret;
    }*/
    public int find(int[] nums,int tar){
        int a = 0,b=nums.length-1;
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2 + a;
            if(nums[c] <= tar){
                ans = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return ans;
    }
}
