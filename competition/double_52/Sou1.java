package competition.double_52;

import java.util.Arrays;

/**
 * @author qingjiusanliangsan
 * create 2021-05-15-22:32
 */
public class Sou1 {
    public String sortSentence(String s) {
        String[] tem = s.split(" ");

        int n = tem.length;
        for(int i=0;i<n;i++){
            tem[i] = tem[i].substring(tem[i].length()-1) + tem[i];
        }
        Arrays.sort(tem);
        System.out.println(Arrays.toString(tem));
        String ret = tem[0].substring(1,tem[0].length()-1);
        for(int i=1;i<n;i++){
            ret += " " + tem[i].substring(1,tem[i].length()-1);
        }
        System.out.println(Arrays.toString(tem));
        return ret;
    }

    public static void main(String[] args) {
        Sou1 s1 = new Sou1();
        String s = s1.sortSentence("Myself2 Me1 I4 and3");
        System.out.println(s);
    }
}
