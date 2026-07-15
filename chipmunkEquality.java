import java.io.*;
import java.util.*;

public class chipmunkEquality{
    public static void add(HashMap<Integer,long[]> map,int k,int ops){
        long a[]=map.get(k);
        if(a!=null){
            a[0]++;
            a[1]+=ops;
        }
    }

    public static void addFirst(HashMap<Integer,long[]> map,int k,int ops){
        long a[]=map.get(k);
        if(a==null){
            a=new long[2];
            map.put(k,a);
        }
        a[0]++;
        a[1]+=ops;
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a[]=new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            HashMap<Integer,long[]> map=new HashMap<>();

            int ops=0;
            int k=a[0];

            addFirst(map,k,ops);

            if(k==1) addFirst(map,2,1);

            while(k!=1){
                if(k%2==1) k+=1;
                else k/=2;

                ++ops;
                addFirst(map,k,ops);
            }

            for(int i=1;i<n;i++){
                ops=0;
                k=a[i];

                add(map,k,ops);

                if(k==1) add(map,2,1);

                while(k!=1){
                    if(k%2==1) k+=1;
                    else k/=2;

                    ++ops;
                    add(map,k,ops);
                }
            }
            
            long min=Long.MAX_VALUE;
            for(Map.Entry<Integer,long[]> entry:map.entrySet()){
                long temp[]=entry.getValue();
                if(temp[0]==n) min=Math.min(min,temp[1]);
            }
            sb.append(min).append("\n");
        }

        System.out.println(sb);
    }
}