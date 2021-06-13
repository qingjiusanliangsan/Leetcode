package lc_1000.lc692;

import java.util.*;

/**
 * @author qingjiusanliangsan
 * create 2021-05-20-10:39
 */
class node{
    String str;
    int num;
    node(String st,int n){
        str = st;
        num = n;
    }
}
//public class Solution {
//    public List<String> topKFrequent(String[] words, int k) {
//        int n = words.length;
//        List<String > ret = new ArrayList<>();
//        HashMap<String,Integer> hMap = new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(hMap.get(words[i]) == null){
//                hMap.put(words[i],1);
//            }
//            else{
//                hMap.put(words[i],hMap.get(words[i])+1);
//            }
//        }
//
//        return ret;
//    }
//}
public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        for (String word : words) {
            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue() == entry2.getValue() ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> ret = new ArrayList<String>();
        while (!pq.isEmpty()) {
            ret.add(pq.poll().getKey());
        }
        Collections.reverse(ret);
        return ret;
    }
}
