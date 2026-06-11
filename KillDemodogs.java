

import java.util.*;
import java.io.*;
public class KillDemodogs{

    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Long> list = new ArrayList<>();
        long dmod = 1_000_000_007L;

        for(int m=0;m<t;m++){
            long n = Long.parseLong(br.readLine());
            long A = n % dmod;
            long B = (4*n - 1) % dmod;
            long C = (n+1) % dmod;
            long D = (A * B) % dmod;
            long K = (D * C) % dmod;
            long tb = ((K) * 337) % dmod;
            list.add(tb);

        }

        for(int i=0;i<t;i++) System.out.println(list.get(i));

    }
}