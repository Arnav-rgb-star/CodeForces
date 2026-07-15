
import java.io.*;
import java.util.*;
public class journeyPlanning {

    public static class Pair{
        int val;
        int idx;
        Pair(int x,int b){
            this.val=x;
            this.idx=b;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long max=0;
        long sum=0;
        int a[]=new int[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.val!=y.val ? Integer.compare(x.val,y.val):Integer.compare(x.idx,y.idx));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
            pq.add(new Pair(a[i]-i,i));
        } 
        int lastVal=-1;
        int lastIdx=-1;
        while(!pq.isEmpty()){

            Pair p = pq.poll();
            int val=p.val;
            int idx = p.idx;
            if(lastVal==-1 && lastIdx==-1){
                lastIdx=idx;
                lastVal=val;
                sum=(long)a[idx];
            }else{
                if(val==lastVal  && lastIdx<=idx){
                    sum+= (long)a[idx];
                    lastIdx=idx;
                    lastVal=val;
                }else{
                    sum=(long)a[idx];
                    lastIdx=idx;
                    lastVal=val;
                }
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}
