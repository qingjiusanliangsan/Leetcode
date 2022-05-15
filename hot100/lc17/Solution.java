package hot100.lc17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-05-11-19:28
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] strs = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        for(int i=0;i<digits.length();i++){
            List<String> tem = new ArrayList<>();
            int index = digits.charAt(i)-'2';
            for(int j=0;j<strs[index].length();j++){
                String ptr = String.valueOf(strs[index].charAt(j));
                if(res.size() == 0){
                    tem.add(ptr);
                }
                else{
                    for(String pl : res){
                        tem.add(pl+ptr);
                    }
                }
            }
            res = tem;
        }
        return res;
    }
}
