import java.util.*;
import java.io.*;
public class ababConst {

    private static boolean possible(String x){

    int n = x.length(); 
    if(n%2 ==0){
        for(int i=0;i<n-1;i+=2){
            if(x.charAt(i)!=x.charAt(i+1) || x.charAt(i)=='?' || x.charAt(i+1)=='?') continue;
            else return false;
        }
    }else{
        if(x.charAt(0)=='b') return false;
        for(int i=1;i<n-1;i+=2){
            if(x.charAt(i)!=x.charAt(i+1) || x.charAt(i)=='?' || x.charAt(i+1)=='?') continue;
            else return false;
        }
    }
    return true;
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringBuilder tar = new StringBuilder();
            String x = br.readLine();
            boolean pos = possible(x);
            
            if(pos) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}