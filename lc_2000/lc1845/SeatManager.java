package lc_2000.lc1845;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class SeatManager {
    TreeSet<Integer> tset;
    public SeatManager(int n) {
        tset = new TreeSet<>();
        for(int i=0;i<n;i++){
            tset.add(i+1);
        }
    }
    public int reserve() {
        int ret = tset.first();
        tset.remove(ret);
        return ret;
    }

    public void unreserve(int seatNumber) {
        tset.add(seatNumber);
    }
}

/*
class SeatManager {
    PriorityQueue<Integer> queue;
    int i;
    public SeatManager(int n) {
        queue=new PriorityQueue<>();
        i=1;
    }
    public int reserve() {
        if(!queue.isEmpty()){
            return queue.poll();
        }else{
            int temp=i;
            i++;
            return temp;
        }
    }
    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}*/
