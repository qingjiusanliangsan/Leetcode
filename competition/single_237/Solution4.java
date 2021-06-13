package competition.single_237;

/**
 * @author qingjiusanliangsan
 * create 2021-04-18-10:02
 */
public class Solution4 {
    public int getXORSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int ret1 = arr1[0];
        for(int i=1;i<n;i++){
            ret1 = ret1^arr1[i];
        }
        int ret2 = arr2[0];
        for(int i=1;i<m;i++){
            ret2 = ret2^arr2[i];
        }
        return ret1&ret2;
    }

    public static void main(String[] args) {
        Solution4 s4 = new Solution4();



    }
}
