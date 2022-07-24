package competition.double_79;

/**
 * @author qingjiusanliangsan
 * create 2022-05-28-22:28
 */
public class Solution1 {
    public boolean digitCount(String num) {
        int[] arr = new int[10];
        int n = num.length();
        for(int i=0;i<n;i++){
            arr[num.charAt(i)-'0']++;
        }
        for(int i=0;i<n;i++){
            int val = num.charAt(i)-'0';
            if(arr[i] != val){
                return false;
            }
        }
        return true;
    }
}
