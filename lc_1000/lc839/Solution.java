package lc_1000.lc839;

public class Solution {
    int index[];
    public int find(int x){
        if(x != index[x]){
            index[x] = find(index[x]);
        }
        return index[x];
    }
    public boolean cmp(String s1, String s2){
        int n = s1.length();
        int flag = 0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                flag++;
            }
            if(flag>2){
                return false;
            }
        }
        if(flag==0||flag==2){
            return true;
        }
        return false;
    }
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int ret = 0;
        index = new int[n];
        for(int i=0;i<n;i++){
            index[i] = i;
        }

        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int fi = find(i);
                int fj = find(j);
                if (fi == fj) {
                    continue;
                }
                if(cmp(strs[i],strs[j])){
                    index[fi] = fj;
                }

            }
        }
        for(int i=0;i<n;i++){
            if(index[i] == i){
                ret++;
            }
        }
        return ret;
    }
    public static void main(String[] args){
        String[] strs = {"blw","bwl","wlb"};
        Solution ret = new Solution();
        System.out.println(ret.numSimilarGroups(strs));
    }
}