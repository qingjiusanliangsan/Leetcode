package lc_1000.lc155;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author qingjiusanliangsan
 * create 2022-05-11-11:44
 */
public class MinStack {
    Deque<Integer> A_que;
    Deque<Integer> B_que;
    int m;
    public MinStack() {
        A_que = new ArrayDeque<>();
        B_que = new ArrayDeque<>();
        m = Integer.MAX_VALUE;
    }

    public void push(int val) {
        m = Math.min(m,val);
        A_que.push(val);
        B_que.push(m);
    }

    public void pop() {
        A_que.pop();
        B_que.pop();
        if(!A_que.isEmpty()){
            m = B_que.peek();
        }
        else{
            m = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return A_que.peek();
    }

    public int getMin() {
        return B_que.peek();
    }
}
