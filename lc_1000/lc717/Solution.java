package lc_1000.lc717;

/**
 * @author qingjiusanliangsan
 * create 2022-02-20-10:09
 */
public class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        for(int i=0;i<n-1;++i){
            if(bits[i]==0){
                continue;
            }
            else{
                if(i+1<n-1){
                    i++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
