
import java.io.*;
import java.util.*;
public class noOfProducts {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        long a[]=new long[t];

        StringTokenizer st =new StringTokenizer(br.readLine());
        for(int i=0;i<t;i++) a[i]=Long.parseLong(st.nextToken());

        long p=0;
        long n=0;
        long tp=0;
        long tn=0;

        for(int i=0;i<t;i++){
            if(a[i]>0){
                p+=1;
            }else{
                long temp=n;
                n=p+1;
                p=temp;
            }
            tp+=p;
            tn+=n;
        }
        System.out.println(tn+ " "+tp);
    }
}
