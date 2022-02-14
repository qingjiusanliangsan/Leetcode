package lc_2000.lc2192;

import java.util.Locale;

/**
 * @author qingjiusanliangsan
 * create 2022-02-14-18:23
 */
public class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        StringBuilder stb = new StringBuilder();
        String[] strs = title.split(" ");
        for(String str : strs){
            if(str.length()<=2){
                stb.append(str);
                stb.append(' ');
            }
            else{
                stb.append(Character.toUpperCase(str.charAt(0)));
                stb.append(str.substring(1));
                stb.append(' ');
            }
        }
        String ans = stb.toString();
        return ans.substring(0,stb.length()-1);
    }
}