package lc_1000.lc690;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qingjiusanliangsan
 * create 2021-05-18-17:48
 */
public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Queue<Integer> temQ = new LinkedList<>();
        int ret = 0;
        int a;
        temQ.add(id);
        while(temQ.size()!=0){
            int s;
            a = temQ.remove();
            for(int i=0;i<employees.size();++i){
                Employee temE = employees.get(i);
                if(temE.id==a){
                    s=i;
                    ret += temE.importance;
                    for(Integer j: temE.subordinates){
                        temQ.add(j);
                    }
                    employees.remove(temE);
                    break;
                }
            }

        }

        return ret;
    }

    public static void main(String[] args) {
        Solution so = new Solution();

    }
}
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
