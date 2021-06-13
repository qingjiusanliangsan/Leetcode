package lc_500.lc96;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qingjiusanliangsan
 * create 2021-05-25-13:54
 */
public class Solution {
    public int numTrees(int n) {
        int res = 0;
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = i+1;
        }
        for(int i=0;i<n;i++){
            List<Integer> tem = new ArrayList<>();
            make(tem,i,i+1,e);
        }

        return res;
    }
    public void make(List<Integer> Il,int z, int s, int e){
        List<Integer> tem = new ArrayList<>(Il);
        tem.add(z);
        if(s==e){
            tem.add(e);
            System.out.println(Arrays.toString(tem.toArray()));
        }
        else if(s+1 == e){
            make(tem,s,e,e);
            make(tem,e,s,s);
        }
        else{
            for(int i=s+1;i<e;i++){
                make(tem,i,s,i-1);
                make(tem,i,i+1,e);
            }
        }

    }

}
