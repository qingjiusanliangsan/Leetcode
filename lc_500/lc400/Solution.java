package lc_500.lc400;

public class Solution {
    private static int[] table1 = new int[9];
    private static int[] table2 = new int[9];
    static {
        for(int i=0;i<8;i++){
            table1[i] = 9*(int)Math.pow(10,i)*(i+1);
        }
        table2[0] = table1[0];
        for(int i=1;i<8;i++){
            table2[i] = table2[i-1] + table1[i];
        }
    }
    public int findNthDigit(int n) {
        if(n<=9){
            return n;
        }
        int a,b,c,z=1;
        for(z=1;z<8;z++){
            if(n<=table2[z]){
                break;
            }
        }
        a = z+1;
        n -=table2[z-1];
        c = (int)Math.pow(10,a-1) + n/a;
        b = n%a;
        if(b==0){
            return (c-1)%10;
        }
        else{
            String s = String.valueOf(c);
            return Integer.parseInt(s.substring(b-1,b));
        }
    }
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.findNthDigit(1000000000));
    }
}
