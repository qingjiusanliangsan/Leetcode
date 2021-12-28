package lc_1500.lc1078;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-12-26-9:59
 */
public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] ntext = text.split(" ");
        int n = ntext.length;
        for(int i=0;i<n-2;i++){
            if(ntext[i].equals(first)){
                if(ntext[i+1].equals(second)){
                    res.add(ntext[i+2]);
                }
            }
        }
        String[] res_t = new String[res.size()];
        int a = 0;
        while (a<res.size()){
            res_t[a] = res.get(a);
            ++a;
        }
        return res_t;
    }
}
