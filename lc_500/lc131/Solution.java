package lc_500.lc131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<List<String>>();
        int n = s.length();
        if(n==0){
            return ret;
        }
        if(n==1){
            List<String> tem = new ArrayList<String>();
            tem.add(s);
            ret.add(tem);
            return ret;
        }

        return ret;
    }
}
