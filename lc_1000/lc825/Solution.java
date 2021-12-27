package lc_1000.lc825;

import java.util.Arrays;

public class Solution {
    public int numFriendRequests1(int[] ages) {
        int res =0,n=ages.length,count=1;
        Arrays.sort(ages);
        int a=0,b=0;
        while (b<n){
            if(ages[b]>14){
                if(b==n-1 || b<n-1 && ages[b] != ages[b+1]){
                    int tem = (int) (Math.floor(ages[b]*0.5)+7);
                    while (a<b && ages[a]<=tem){
                        ++a;
                    }
                    res = res + (b-a)*count;
                    count = 1;
                }
                else{
                    ++count;
                }
            }
            ++b;
        }
        return res;
    }
    public int numFriendRequests(int[] ages) {
        int res =0,n=ages.length,count=1;
        Arrays.sort(ages);
        for(int i=0;i<n;i++){
            if(ages[i] > 14){
                if(i==n-1 || i<n-1 && ages[i] != ages[i+1]){
                    int tem = (int) (Math.floor(ages[i]*0.5)+7);
                    int c = find(ages,0,i-1,tem);
                    if(c >=0){
                        res = res + (i-c)*count;
                    }
                    count=1;
                }
                else{
                    count++;
                }
            }
        }

        return res;
    }
    public int find(int[] nums,int a,int b,int tar){
        int ans = -1;
        while(a<=b){
            int c = (b-a)/2+a;
            if(nums[c] > tar){
                ans = c;
                b = c-1;
            }
            else{
                a = c+1;
            }
        }
        return ans;
    }
}

