package competition.single_237;

import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2021-04-18-10:02
 */
public class Solution3 {
    class Task{
        int star;
        int end;
        int index;

        @Override
        public String toString() {
            return "Task{" +
                    "star=" + star +
                    ", end=" + end +
                    ", index=" + index +
                    '}';
        }
    }
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] ret = new int[n];
        Task[] nums = new Task[n];
        int s = tasks[0][0];
        PriorityQueue<Task> sta = new PriorityQueue<Task>(new Comparator<Task>() {
            public int compare(Task o1, Task o2) {
                if(o1.end > o2.end)
                    return 1;
                else if(o1.end == o2.end){
                    if(o1.star >= o2.star)
                        return 1;
                    else return -1;
                }
                return -1;
            }
        });
        for(int i=0;i<n;i++){
            s=Math.min(s,tasks[i][0]);
            Task ta = new Task();
            ta.star = tasks[i][0];
            ta.end = tasks[i][1];
            ta.index = i;
            nums[i] = ta;
        }
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print("\n");
        }
        int pl=0;
        int pk=0;
        while(pl<n){
            for(int i = pk;i<n;i++){
                pk=i;
                if(nums[i].star<=s){
                    sta.add(nums[i]);
                    pk = i+1;
                }
                else{
                    break;
                }
            }
            if(sta.size()!=0){
                ret[pl++] = sta.peek().index;
                s += sta.peek().end;
                sta.poll();
            }
        }
        return ret;
    }
    public static void sort(Task[] ob) {
        Arrays.sort(ob, new Comparator<Task>() {
            public int compare(Task o1, Task o2) {
                if(o1.star > o2.star)
                    return 1;
                return -1;
            }
        });
    }
    public static void main(String[] args) {
        Solution3 s3 = new Solution3();
//        int[][] tasks = {{19,13},{16,9},{21,10},{32,25},{37,4},{49,24},{2,15},{38,41},{37,34},{33,6},{45,4},{18,18},{46,39},{12,24}};
//        int[][] tasks = {{7,10},{7,12},{7,5},{7,4},{7,2}};
        int[][] tasks = {{1,2},{2,4},{3,2},{4,1}};
        System.out.println(Arrays.toString(s3.getOrder(tasks)));
    }
}