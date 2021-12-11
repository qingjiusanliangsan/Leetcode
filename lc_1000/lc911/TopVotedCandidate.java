package lc_1000.lc911;

public class TopVotedCandidate {
    int[] times,Per;
    int n;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        this.n = persons.length;
        int p_n = 0;
        for(int e: persons){
            p_n = Math.max(p_n,e);
        }
        int[] num = new int[p_n+1];
        int b=0;
        for(int i=0;i<n;i++){
            ++num[persons[i]];
            if(persons[i]!=b && num[b] <= num[persons[i]]){
                b = persons[i];
            }
            persons[i] = b;
        }
        Per = persons;
    }

    public int q(int t) {
        int a=0,b=n-1,ans=0;
        while(a<=b){
            int c = (b-a)/2+a;
            if(times[c]>t){
                b = c-1;
            }
            else{
                a=c+1;
                ans = c;
            }
        }
        return Per[ans];
    }
}
