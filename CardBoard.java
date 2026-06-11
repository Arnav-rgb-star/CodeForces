
import java.util.*;
import java.io.*;

public class CardBoard{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Long> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            double [] s = new double[n];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) s[i] = Double.parseDouble(st.nextToken());

            double B = 0, A=0;
            double w=0,l=0;
            double r=0;

            for(int i=0;i<n;i++){
                A+= s[i]*s[i];
                B+= s[i]; 
            }
            double k = A- (double)c;
            l= n * k;
            double j = B*B;
            r = Math.sqrt(j - l);

            w = (r - B)/(2*n);
            ans.add((long)Math.round(w));
        }
            for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}