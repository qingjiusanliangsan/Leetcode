package lc_500.lc128;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*class Solution {
    public int longestConsecutive(int[] nums) {
        int ret = 0;

        int m=0;
        for(int e:nums){
            m = Math.max(m,e);
        }
        int[] count = new int[m+1];
        for(int e:nums){
            count[e] = 1;
        }
        for(int e:nums){
            if(count[e]==1){
                count[e] += count[e-1];
            }

        }
        return ret;
    }

}*/
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
