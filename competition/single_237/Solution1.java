package competition.single_237;

/**
 * @author qingjiusanliangsan
 * create 2021-04-18-10:02
 */
public class Solution1 {
    public boolean checkIfPangram(String sentence) {
        int[] num = new int[26];
        int n = sentence.length();
        for(int i=0;i<n;i++){
            num[sentence.charAt(i)-'a'] = 1;
        }
        for(int i=0;i<26;i++){
            if(num[i]==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        String sentence = "leetcode";
        System.out.println(s1.checkIfPangram(sentence));

    }
}
