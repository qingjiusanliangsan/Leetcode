package competition.double_79;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

/**
 * @author qingjiusanliangsan
 * create 2022-05-28-22:28
 */
public class Solution2 {
    public String largestWordCount(String[] messages, String[] senders) {
        int n = messages.length;
        Map<String,Integer> hmap = new HashMap<>();
        for(int i=0;i<n;i++){
            int word_n = messages[i].split(" ").length;
            hmap.put(senders[i],hmap.getOrDefault(senders[i],0)+word_n);
        }
        String res = senders[0];
        int num = hmap.get(res);
        for(Map.Entry<String,Integer> E : hmap.entrySet()){
            String tem_res = E.getKey();
            int tem_num = E.getValue();
            if(tem_num > num){
                res = tem_res;
                num = tem_num;
            }
            else if(tem_num == num){
                if(tem_res.compareTo(res)>0){
                    res = tem_res;
                }
            }
        }
        return res;
    }
}
