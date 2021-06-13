package lc_1000.lc706;

import java.util.Arrays;

public class MyHashMap {

    /** Initialize your data structure here. */
//    boolean[] index = new boolean[1000009];
    int[] num = new int[1000002];
    public MyHashMap() {
        Arrays.fill(num,-1);
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        num[key] = value;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return num[key];

    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        num[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
