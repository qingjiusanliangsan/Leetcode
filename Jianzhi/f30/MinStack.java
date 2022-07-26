package Jianzhi.f30;

import java.util.Stack;

/**
 * @author qingjiusanliangsan
 * create 2022-07-24-18:03
 */
public class MinStack {
    Stack<Integer> stackValue;
    Stack<Integer> stackMin;
    int m;
    /** initialize your data structure here. */
    public MinStack() {
        stackValue = new Stack<>();
        stackMin = new Stack<>();
        m = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stackValue.push(x);
        if(stackMin.size()>0){
            m = Math.min(stackMin.peek(),x);
        }
        else{
            m = x;
        }
        stackMin.push(m);
    }

    public void pop() {
        if(stackMin.size()>0){
            stackValue.pop();
            stackMin.pop();
        }
    }

    public int top() {
        if(stackValue.size()>0){
            return stackValue.peek();
        }
        return -1;
    }

    public int min() {
        if(stackMin.size()>0){
            return stackMin.peek();
        }
        return 0;
    }
}