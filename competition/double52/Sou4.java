package competition.double52;

/**
 * @author qingjiusanliangsan
 * create 2021-05-15-23:16
 */
public class Sou4 {
    public int sumOfFlooredPairs(int[] nums) {
//        Arrays.sort(nums);
        int tem = 1000000007;
        int n = nums.length;
        int ret = n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ret += (int)nums[j]/nums[i];
                ret += (int)nums[i]/nums[j];
                ret = ret % tem;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Sou4 s4  =  new Sou4();
        int[] nums = {7,7,7,7,7,7,7};
        System.out.println(s4.sumOfFlooredPairs(nums));
    }
}
