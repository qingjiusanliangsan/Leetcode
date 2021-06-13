package lc_500.lc38;

public class Solution {
    public String countAndSay(int n) {
        String s0 = "1";
        if(n==1){
            return s0;
        }
        for(int i=2;i<=n;i++){
            String s1 = "";
            for(int j=0;j<s0.length();j++){
                char tem = s0.charAt(j);
                int num=1;
                while(j<s0.length()-1 && tem == s0.charAt(j+1)){
                    j = j+1;
                    num++;
                }
                s1 = s1 + String.valueOf(num) + String.valueOf(tem);
            }
            s0 = s1;
        }
        return s0;
    }
    public static void main(String[] args){
        Solution so =new Solution();
        System.out.println(so.countAndSay(4));
    }
}
