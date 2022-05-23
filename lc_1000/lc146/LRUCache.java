package lc_1000.lc146;

import java.util.HashMap;

/**
 * @author qingjiusanliangsan
 * create 2022-05-17-15:15
 */

public class LRUCache {
    HashMap<Integer,ListNode> hmap;
    int Size;
    int Cap;
    ListNode head,tail;

    public LRUCache(int capacity) {
        head = new ListNode();
        tail = new ListNode();
        head.next = tail;
        tail.pre = head;
        hmap = new HashMap<>();
        Cap = capacity;
        Size = 0;
    }

    public int get(int key) {
        if(hmap.containsKey(key)){
            ListNode tem = hmap.get(key);
            moveToHead(tem);
            return tem.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hmap.containsKey(key)){
            ListNode node = hmap.get(key);
            node.val = value;
            moveToHead(node);
            return;
        }
        ListNode tem = new ListNode(key,value);
        if(Size >= Cap){
            removeTail();
            Size--;
        }
        Size++;
        hmap.put(key,tem);
        putHead(tem);
    }
    public void remove(ListNode node){
        node.next.pre = node.pre;
        node.pre.next = node.next;
    }
    public void putHead(ListNode node){
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }
    public void moveToHead(ListNode node){
        remove(node);
        putHead(node);
    }
    public void removeTail(){
        hmap.remove(tail.pre.key);
        remove(tail.pre);
    }
}

class ListNode{
    int key;
    int val;
    ListNode next;
    ListNode pre;
    public ListNode(){}
    public ListNode(int key,int val){
        this.key = key;
        this.val = val;
    }
}