package competition.double_72;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2022-02-19-21:40
 */
public class Solution3 {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> ans = new ArrayList<>();
        long st = 2;
        long num = finalSum;
        if(finalSum%2==1){
            return ans;
        }
        while (num -st > st){
            ans.add(st);
            num-=st;
            st+=2;
        }
        if(num==finalSum){
            ans.add(num);
            return ans;
        }
        else{
            ans.add(num);
        }
        return ans;
    }
}
