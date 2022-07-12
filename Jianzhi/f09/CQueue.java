package Jianzhi.f09;

import java.util.Stack;

public class CQueue {
    Stack<Integer> A;
    Stack<Integer> B;
    public CQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void appendTail(int value) {
        A.add(value);
    }

    public int deleteHead() {
        if(B.empty()){
            if(A.empty()){
                return -1;
            }
            while (!A.empty()){
                B.add(A.pop());
            }
        }
        return B.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */