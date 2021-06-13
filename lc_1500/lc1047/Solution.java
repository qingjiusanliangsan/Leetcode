package lc_1500.lc1047;

public class Solution {
    public String removeDuplicates(String S) {
        String tem="";
        for(int i=0;i<S.length();){
            if(i+1 < S.length() && S.charAt(i)==S.charAt(i+1)){
                int j=i+2;
                if(i>0){
                    tem = S.substring(0,i) + S.substring(j);
                    i = i-1;
                }else if(i==0){
                    tem = S.substring(j);
                    i=0;
                }
                S = tem;
            }
            else{
                i++;
            }

        }
        return S;
    }
    public static void main(String[] args){
        Solution so = new Solution();
        String str = "abbaca";
        System.out.println(so.removeDuplicates(str));
    }

}
