package competition.double52;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-05-15-22:43
 */
public class Sou2 {
    public int[] memLeak(int memory1, int memory2) {
        int[] ret = new int[3];
        int star = 1;
        while(true){
//            if(star>memory1 && star>memory2){
//                ret[0] = star;
//                ret[1] = memory1;
//                ret[2] = memory2;
//                break;
//            }
            if(memory1 >= memory2){
                if(star<=memory1){
                    memory1 -= star;
                    star++;
                    continue;
                }
                else{
                    ret[0] = star;
                    ret[1] = memory1;
                    ret[2] = memory2;
                    break;
                }
            }
            else{
                if(star<=memory2){
                    memory2 -= star;
                    star++;
                    continue;
                }
                else{
                    ret[0] = star;
                    ret[1] = memory1;
                    ret[2] = memory2;
                    break;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Sou2 s2 = new Sou2();
        int[] ret = s2.memLeak(2,2);
        System.out.println(Arrays.toString(ret));
    }
}
