package lc_1500.lc1146;

import java.util.ArrayList;
import java.util.List;

public class SnapshotArray {
    int snap_id;
    List<List<Integer>> sna;
    List<List<Integer>> num;
    public SnapshotArray(int length) {
        snap_id=0;
        sna = new ArrayList<>();
        num = new ArrayList<>();
        for(int i=0;i<length;i++){
            List<Integer> tem_sna = new ArrayList<>();
            List<Integer> tem_num = new ArrayList<>();
            tem_sna.add(0);
            tem_num.add(0);
            sna.add(tem_sna);
            num.add(tem_num);
        }
    }

    public void set(int index, int val) {
        List<Integer> tem_sna = sna.get(index);
        List<Integer> tem_num = num.get(index);
        if(tem_sna.get(tem_sna.size()-1)==snap_id){
            tem_num.set(tem_num.size()-1,val);
            num.set(index,tem_num);
            return;
        }
        tem_sna.add(snap_id);
        sna.set(index,tem_sna);
        tem_num.add(val);
        num.set(index,tem_num);
    }

    public int snap() {
        this.snap_id++;
        return this.snap_id-1;
    }

    public int get(int index, int snap_id) {
        List<Integer> tem_sna = sna.get(index);
        List<Integer> tem_num = num.get(index);
        int a=0,b=sna.get(index).size()-1,ans=0;
        while(a<=b){
            int c= (b-a)/2+a;
            if(tem_sna.get(c) <= snap_id){
                ans = c;
                a = c+1;
            }
            else{
                b = c-1;
            }
        }
        return tem_num.get(ans);
    }
}
