
import java.util.*;
import java.io.*;
public class basketballGame {

static long dp[][];

static long f(int i,int last,long a[],long b[]){
    if(i<0) return 0;
    int state = last+1;
    if(dp[i][state]!=-1) return dp[i][state];

    long take=0;
    long notTake=f(i-1,-1,a,b);
    
    if(last==-1) take=Math.max(a[i]+f(i-1,0,a,b),b[i]+f(i-1,1,a,b));
    else if(last==0) take=b[i]+f(i-1,1,a,b);
    else take=a[i]+f(i-1,0,a,b);

    return dp[i][state]= Math.max(take,notTake);
}
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a[]=new long[n];
        long b[]=new long[n];

        for(int i=0;i<n;i++) a[i]=Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) b[i]=Long.parseLong(st.nextToken());

        dp = new long[n][3];
        for(int i=0;i<n;i++) Arrays.fill(dp[i],-1);
        
        long sum=f(n-1,-1,a,b);
        System.out.println(sum);
    }
}
