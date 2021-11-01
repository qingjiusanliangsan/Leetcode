package ALib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;




public class DataStruct {
    public static void main(String[] args) {

        class stu implements Comparable<stu>{
            //实现Comparable接口   可以使用Collections.sort(list)排序
            int age;
            String name;
            public stu(int age, String name) {
                super();
                this.age = age;
                this.name = name;
            }
            @Override
            public int compareTo(stu o) {
                // TODO Auto-generated method stub
                return age-o.age;
            }
            //为了在set中判定自定义类是不是同一个，需要重写对象的equals方法和hashCode方法
            @Override
            public boolean equals(Object obj) {
                if(obj instanceof stu) {//注意equals方法的套路
                    stu s = (stu) obj;
                    return name.equals(s.name);
                }
                return false;
            }

            @Override
            public int hashCode() {
                // TODO Auto-generated method stub
                return name.hashCode();
            }

            @Override
            public String toString() {
                return "stu{" +
                        "age=" + age +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        map.put("zhaosi", "12");
        map.put("wangwu", "10");
        System.out.println(map.get("zhaosi"));
        System.out.println(map.containsKey("wangwu"));


        System.out.println("==================");
        Set<stu> set = new HashSet<stu>();
        set.add(new stu(100, "liu"));
        set.add(new stu(1, "liu"));
        System.out.println(set.size());

        System.out.println("==================");
        Queue<String> q = new LinkedList<String>();
        q.offer("1");
        q.offer("2");
        q.offer("3");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
            //q.peek();取出顶端
        }

        System.out.println("==================");
        Stack<String> sta = new Stack<String>();
        sta.push("1");
        sta.push("2");
        sta.push("3");
        while(!sta.isEmpty()) {
            System.out.println(sta.pop());
            //sta.peek();取出顶端
        }


        ArrayList<String> arr = new ArrayList<String>();
        arr.add("ss");
        System.out.println(arr.get(0));
        System.out.println(arr.indexOf("ss"));

    }
}


