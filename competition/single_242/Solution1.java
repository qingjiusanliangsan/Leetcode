package competition.single_242;

/**
 * @author qingjiusanliangsan
 * create 2021-05-23-10:17
 */
public class Solution1 {
    public boolean checkZeroOnes(String s) {
        int a = make(s,'1');
        int b = make(s,'0');
        if(a>b){
            return true;
        }
        return false;
    }
    public int make(String s,char c){
        int n = s.length();
        int res = 0;
        int tem;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == c){
                tem = 1;
                int j= i+1;
                while(j<n){
                    if(s.charAt(j) == c){
                        tem++;
                        j++;
                    }
                    else{
                        break;
                    }
                }
                res = Math.max(res,tem);
                i = j-1;
            }

        }

        return res;
    }
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();

    }
}
