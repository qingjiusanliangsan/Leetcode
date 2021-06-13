package lc_500.lc28;

/**
 * @author qingjiusanliangsan
 * create 2021-04-20-9:02
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m==0){
            return 0;
        }
        for(int i=0;i<=n-m;i++){
//            System.out.println(haystack.substring(i,i+m));
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello", needle = "ll";
        Solution s1 = new Solution();
        System.out.println(s1.strStr(haystack,needle));
    }
}
