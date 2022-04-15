package Interview.huawei;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> relyList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        while (in.hasNext()){
            String[] tem = in.nextLine().split(",");
            ArrayList<Integer> list = new ArrayList<>();
            for(String str : tem){
                list.add(Integer.parseInt(str));
            }
            relyList.add(list);
        }
        int[] state = new int[n];
        boolean canStart = false;
        int step = 0;
        if(relyList.get(m).get(0) == 0){
            System.out.println("null");
            return;
        }else{
            Queue<Integer> q = new LinkedList<>();
            ArrayList<Integer> rely = relyList.get(m);
            for(int i=1;i<=rely.get(0);++i){
                q.offer(rely.get(i));
            }
            while (!q.isEmpty() && step<=5000){
                int size = q.size();
                for(int i=0;i<size;++i){
                    int tem = q.poll();
                    rely = relyList.get(tem);
                    if(rely.get(0) == 0) continue;
                    for(int j=1;j<rely.get(0);++j){
                        q.offer(rely.get(j));
                    }
                }
                step++;
            }
            if(step<=5000) canStart = true;
        }
        if(!canStart){
            System.out.println(-1);
        }else{
            Queue<Integer> q = new LinkedList<>();
            ArrayList<Integer> rely = relyList.get(m);
            for(int i=1;i<=rely.get(0);++i){
                q.offer(rely.get(i));
            }
            while (!q.isEmpty()){
                int size = q.size();
                for(int i=0;i<size;++i){
                    int tem = q.poll();
                    state[tem] =1;
                    rely = relyList.get(tem);
                    if(rely.get(0) == 0) continue;
                    for(int j=1;j<rely.get(0);++j){
                        q.offer(rely.get(j));
                    }
                }
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<n;++i){
                    if(state[i]==1){
                        sb.append(i);
                        sb.append(',');
                    }
                }
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb);
            }
        }
    }
}