package competition.single_282;

/**
 * @author qingjiusanliangsan
 * create 2022-02-26-23:49
 */
public class Solution1 {
    public int prefixCount(String[] words, String pref) {
        int b = pref.length();
        int ans = 0;
        for(String str : words){
            int a = str.length();
            if(a>=b && str.substring(0,b).equals(pref)){
                ++ans;
            }
        }
        return ans;
    }
}
