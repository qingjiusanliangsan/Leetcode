package competition.single_281;

/**
 * @author qingjiusanliangsan
 * create 2022-02-20-10:16
 */
public class Solution3 {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] num = new int[26];
        int n = s.length();
        StringBuffer ans = new StringBuffer();
        for(int i=0;i<n;++i){
            num[s.charAt(i)-'a']++;
        }
        int a=25,b;
        while (a>=0){
            if(num[a]>repeatLimit){
                num[a]-=repeatLimit;
                for(int j=0;j<repeatLimit;++j){
                    ans.append((char)('a'+a));
                }
                b=a-1;
                while (b>=0 && num[b]<1){
                    --b;
                }
                if(b<0){
                    break;
                }
                --num[b];
                ans.append((char)('a'+b));
            }
            else{
                while (num[a]>0){
                    ans.append((char)('a'+a));
                    --num[a];
                }
                while (a>=0&&num[a]<1){
                    --a;
                }
            }
        }
        return ans.toString();
    }
}
