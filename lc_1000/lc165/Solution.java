package lc_1000.lc165;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> ver1 = get_da(version1);
        List<Integer> ver2 = get_da(version2);
        int a = 0;
        int b = 0;
        while (a<ver1.size() && b<ver2.size()){
            if(ver1.get(a)>ver2.get(b)){
                return 1;
            }
            else if(ver1.get(a)<ver2.get(b)){
                return -1;
            }
            ++a;
            ++b;
        }
        if(a==ver1.size()){
            while(b<ver2.size()){
                if(ver2.get(b)>0){
                    return -1;
                }
                ++b;
            }
            return 0;
        }
        while(a<ver1.size()){
            if(ver1.get(a)>0){
                return 1;
            }
            ++a;
        }
        return 0;
    }
    public List<Integer> get_da(String st){
        List<Integer> ret = new ArrayList<>();
        int a = 0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!='.'){
                a = a*10+st.charAt(i)-'0';
            }
            else{
                ret.add(a);
                a=0;
            }
        }
        return ret;
    }
}
