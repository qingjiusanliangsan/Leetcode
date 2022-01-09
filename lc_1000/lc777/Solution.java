package lc_1000.lc777;

/**
 * @author qingjiusanliangsan
 * create 2022-01-02-15:30
 */
public class Solution {
    public boolean canTransform(String start, String end) {
        int n = start.length();
        if(start.equals(end)){
            return true;
        }
        int R=0,L=0;
        for(int i=0;i<n;i++){
            if (start.charAt(i) == 'R') {
                ++R;
            }
            else if(start.charAt(i) == 'L'){
                ++L;
            }
            if (end.charAt(i) == 'R') {
                --R;
            }
            else if(end.charAt(i) == 'L'){
                --L;
            }
        }
        if(R!=0 || L!=0){
            return false;
        }
        int a =0,b=0;
        while (a<n && b<n){
            if(start.charAt(a)=='X'){
                ++a;
                continue;
            }
            if(end.charAt(b)=='X'){
                ++b;
                continue;
            }
            if(start.charAt(a) != end.charAt(b)){
                return false;
            }
            if(start.charAt(a)=='L'){
                if(a<b){
                    return false;
                }
            }
            else if(start.charAt(a)=='R'){
                if(a>b){
                    return false;
                }
            }
            ++a;
            ++b;
        }
        return true;
    }
}
