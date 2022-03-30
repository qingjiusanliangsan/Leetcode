package lc_1000.lc33;

public class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}

/*public class Solution {
    public int search(int[] nums, int target) {
        int res = -1;
        int n=nums.length,a=0,b=nums.length-1,c,ans;
        while(a<=b){
            c = (b-a)/2+a;
            if(nums[c] > nums[b]){
                ans = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }

        return res;
    }
}*/
