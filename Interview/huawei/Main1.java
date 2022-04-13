package Interview.huawei;

/**
 * @author qingjiusanliangsan
 * create 2022-04-13-23:48
 */
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        String[] Title = new String[n];
        String[] Conte = new String[n];
        HashMap<String,Integer> hset = new HashMap();//总的出现次数： 标题*3+文章*1
        HashMap<String,Integer> hone = new HashMap();//在标题中出现的次数
        HashMap<String,Integer> htwo = new HashMap();//在文章中出现的次数
        List<String> hname = new ArrayList<>();//出现的顺序
        PriorityQueue<Ele> pque = new PriorityQueue<>();
        for(int i=0;i<m;++i){
            Title[i] = in.nextLine();
            Conte[i] = in.nextLine();
        }
        for(int i=0;i<m;i++){
            String[] tem = Title[i].split(" ");
            for(String str :tem){
                if(!hset.containsKey(str)){
                    hname.add(str);
                }
                hset.put(str,hset.getOrDefault(str,0)+3);
                hone.put(str,hone.getOrDefault(str,0)+1);
            }
        }
        for(int i=0;i<m;i++){
            String[] tem = Conte[i].split(" ");
            for(String str :tem){
                if(!hset.containsKey(str)){
                    hname.add(str);
                }
                hset.put(str,hset.getOrDefault(str,0)+1);
                htwo.put(str,htwo.getOrDefault(str,0)+1);
            }
        }
        for(int i=0;i<hname.size();++i){
            String name= hname.get(i);
            Ele ele = new Ele(name,hset.get(name),hone.getOrDefault(name,0),htwo.getOrDefault(name,0),i);
            if(pque.size() < n){
                pque.add(ele);
            }
            else{
                if(ele.compareTo(pque.peek())>0){
                    pque.poll();
                    pque.add(ele);
                }
            }
        }
        String[] res = new String[n];
        int k=0;
        while (!pque.isEmpty()){
            Ele tem = pque.poll();
            res[k]=tem.name;
            ++k;
        }
        while (k>0){
            System.out.print(res[--k]);
            if(k!=0){
                System.out.print(" ");
            }
        }
    }
}

class Ele implements Comparable{
    String name;
    int num;
    int til;
    int con;
    int index;
    public Ele(String name,int num,int Til,int con,int index){
        this.name = name;
        this.num = num;
        this.til = Til;
        this.con = con;
        this.index = index;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        Ele tem = (Ele)obj;
        return name.equals(tem.name);
    }
    @Override
    public int compareTo(Object o) {
        Ele tem = (Ele) o;
        if(this.num != tem.num){
            return this.num-tem.num;
        }
        else if(this.til != tem.til){
            return this.til-tem.til;
        }
        else if(this.con != tem.con){
            return this.con-tem.con;
        }
        else {
            return tem.index-this.index;
        }
    }
}