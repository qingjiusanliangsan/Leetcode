package lc_1000.lc705;

public class MyHashSet {

    /** Initialize your data structure here. */
    boolean[] num = new boolean[1000009];
    public MyHashSet() {
    }

    public void add(int key) {
        num[key] = true;
    }

    public void remove(int key) {
        num[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return num[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
