package lc_2000.lc1710;

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        int n = boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++){
            System.out.println(boxTypes[i][0]);
            System.out.println(boxTypes[i][1]);
        }
        for(int i=0;i<n;i++){
            if(boxTypes[i][0]<=truckSize){
                res += boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else{
                res += boxTypes[i][1]*truckSize;
                break;
            }
        }
        return res;

    }
}