package lc_1000.lc765;

public class Solution {
    public int minSwapsCouples(int[] row) {
        int ret = 0;
        int n = row.length;
        int tem;
        for(int i=0;i<n;i=i+2){
            if(row[i]%2==0&&row[i]+1!=row[i+1]){
                ret++;
                tem = row[i+1];
                for(int j=i+1;j<n;j++){
                    if(row[j]==row[i]+1){
                        row[i+1] = row[j];
                        row[j] = tem;
                    }
                }
            }
            else if(row[i]%2==1&&row[i]-1!=row[i+1]){
                ret++;
                tem = row[i+1];
                for(int j=i+1;j<n;j++){
                    if(row[j]==row[i]-1){
                        row[i+1] = row[j];
                        row[j] = tem;
                    }
                }
            }
        }
        return ret;
    }
}
