package lc_1000.lc278;

/**
 * @author qingjiusanliangsan
 * create 2021-06-13-10:12
 */
public class Solution extends VersionControl{
    boolean isBadVersion(int version){
        return true;
    }
    public int firstBadVersion(int n) {
        int a = 1;
        int b = n;
        while(a < b){
            int c = a + (b-a)/2;
            if(isBadVersion(c)){
                b = c;
            }
            else{
                a = c+1;
            }
        }
        return a;
    }
    public int make(int a,int b){
        if(isBadVersion(a)){
            return a;
        }
        if(isBadVersion(b-1)==false){
            return b;
        }
        int c = a + (b-a)/2;
        if(isBadVersion(c)){
            if(isBadVersion(c-1)){
                return c;
            }
            return make(a+1,c);
        }
        else{
            return make(c,b-1);
        }
    }
}



