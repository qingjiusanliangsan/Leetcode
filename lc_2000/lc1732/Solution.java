package lc_2000.lc1732;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-05-08-15:05
 */
public class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        int low = 0, high = jobs.length - 1;
        while (low < high) {
            int temp = jobs[low];
            jobs[low] = jobs[high];
            jobs[high] = temp;
            low++;
            high--;
        }
        int l = jobs[0], r = Arrays.stream(jobs).sum();
        while (l < r) {
            int mid = (l + r) >> 1;
            if (check(jobs, k, mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public boolean check(int[] jobs, int k, int limit) {
        int[] workloads = new int[k];
        return backtrack(jobs, workloads, 0, limit);
    }

    public boolean backtrack(int[] jobs, int[] workloads, int i, int limit) {
        if (i >= jobs.length) {
            return true;
        }
        int cur = jobs[i];
        for (int j = 0; j < workloads.length; ++j) {
            if (workloads[j] + cur <= limit) {
                workloads[j] += cur;
                if (backtrack(jobs, workloads, i + 1, limit)) {
                    return true;
                }
                workloads[j] -= cur;
            }
            // 如果当前工人未被分配工作，那么下一个工人也必然未被分配工作
            // 或者当前工作恰能使该工人的工作量达到了上限
            // 这两种情况下我们无需尝试继续分配工作
            if (workloads[j] == 0 || workloads[j] + cur == limit) {
                break;
            }
        }
        return false;
    }
    /*public int minimumTimeRequired(int[] jobs, int k) {
        PriorityQueue<Integer> tem = new PriorityQueue<>();
        int ret = 0;
        int n = jobs.length;
        Arrays.sort(jobs);
        for(int i = n-1; i>=0; --i){
            if(tem.size()<k){
                tem.add(jobs[i]);
            }
            else{
                ret = tem.remove()+jobs[i];
                tem.add(ret);
            }
        }
        while(tem.size()>0){
            ret = tem.remove();
        }

        return ret;
    }*/
}
