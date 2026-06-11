
import java.util.*;
import java.io.*;
public class kthDiv {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        long root = (long)Math.sqrt(n);
        for(long i=1 ; i<=root;i++){
            if(n%i==0){
                a.add(i);
            if(i!=(n/i)){
                b.add((n/i));
            }
            }
        }
        if(k<=a.size()){
            System.out.println(a.get(k-1));
        }
        else{
            long total = a.size()+b.size();
            if(k<=total && k>a.size()){
                int done = k-a.size();
                System.out.println(b.get(b.size()-done));
            }
            else{
                System.out.println(-1);
            }
        }
        
    }
}
