package lc_1000.lc12;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2021-05-18-15:02
 */
public class Solution {
    HashMap<Integer,String> hashM = new HashMap<>();
    public Solution(){
        hashM.put(1,"I");
        hashM.put(4,"IV");
        hashM.put(5,"V");
        hashM.put(9,"IX");
        hashM.put(10,"X");
        hashM.put(40,"XL");
        hashM.put(50,"L");
        hashM.put(90,"XC");
        hashM.put(100,"C");
        hashM.put(400,"CD");
        hashM.put(500,"D");
        hashM.put(900,"CM");
        hashM.put(1000,"M");
    }
    public String getSt(int num,int a){
        if(num==0)
            return "";
        String st = hashM.get(num);
        if(st == null){
            int b= num/a;
            if(b>1&&b<4){
                st = "";
                while(b>0){
                    st += hashM.get(a);
                    --b;
                }
            }
            if(b>5&&b<9){
                st = hashM.get(5 * a);
                while(b>5){
                    st += hashM.get(a);
                    --b;
                }
            }
        }
        return st;
    }
    public String intToRoman(int num) {
        String ret = "";
        int a = 1;
        Stack<Integer> temSta = new Stack<>();
        while(num>0){
            temSta.add((num%10)*a);
            num = num/10;
            a = a*10;
        }
//        System.out.println(a);
        while(!temSta.empty()){
            a = a/10;
            ret += getSt(temSta.pop(),a);
        }

        return ret;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        String ret = so.intToRoman(3994);
        System.out.println(ret);
    }
}
