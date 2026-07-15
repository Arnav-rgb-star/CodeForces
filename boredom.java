

455A
WRONG
import java.io.*;
import java.util.*;
public class boredom{
    static HashSet<Integer> set;
    static long f(int i,long sum,int a[]){
        if(i<0) return sum;

        long take=0,nottake=f(i-1,sum,a);
        if(!set.contains(a[i])){
            set.add(a[i]+1);
            set.add(a[i]-1);
            take = f(i-1,(long)a[i]+sum,a);
            set.remove(a[i]+1);
            set.remove(a[i]-1);
        }

        return Math.max(take,nottake);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
        set = new HashSet();

        System.out.println(f(n-1,0L,a));
    }
}
