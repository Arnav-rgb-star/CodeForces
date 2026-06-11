

import java.io.*;
import java.util.*;

public class aAndB {

    public static long min(ArrayList<Integer> list){
        long swap=0;
        if (list.size()<=1) return 0;

        int m = list.size()/2;
        int pos=list.get(m);

        for(int i=m;i<list.size();i++){
            swap+=(list.get(i)-(pos));
            ++pos;
        }
        pos=list.get(m)-1;

        for(int i=m-1;i>=0;i--){
            swap+= Math.abs(((pos)-list.get(i)));
            --pos;
        }
        return swap;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            long costA=0;
            long costB;

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            for(int i=0;i<n;i++){
                if(str.charAt(i)=='a'){
                    a.add(i);
                }else{
                    b.add(i);
                }
            }
            costA=min(a);
            costB=min(b);

            long cost=Math.min(costA,costB);
            sb.append(cost).append("\n");
        }
        System.out.println(sb);
    }
}
