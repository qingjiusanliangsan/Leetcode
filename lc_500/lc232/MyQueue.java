package lc_500.lc232;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> pre;
    Stack<Integer> las;
    int num;

    /** Initialize your data structure here. */
    public MyQueue() {
        pre = new Stack<>();
        las = new Stack<>();
        num = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        pre.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(! pre.empty()){
            las.push(pre.pop());
        }
        int ret = las.pop();
        while(! las.empty()){
            pre.push(las.pop());
        }
        return ret;
    }

    /** Get the front element. */
    public int peek() {
        while(! pre.empty()){
            las.push(pre.pop());
        }
        int ret = las.peek();
        while(! las.empty()){
            pre.push(las.pop());
        }
        return ret;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return pre.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */