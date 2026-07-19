
import java.io.*;
import java.util.*;
public class bracketcoloring {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(test-->0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int prefix[]=new int[n+1];
            int color[]=new int[n];

            for(int i=0;i<n;i++) prefix[i+1]=prefix[i]+(str.charAt(i)=='(' ?1:-1);
            boolean one=false;
            boolean two = false;

            if(prefix[n]!=0){
                sb.append("-1").append("\n");
                continue;
            }
            int value=1;
            for(int i=n-1;i>=0;i--){
                if(prefix[i+1]==0){
                    if(str.charAt(i)==')') value=1;
                    else value=2;
                }
                color[i]=value;

                if(value==1) one=true;
                else two=true;
            }

            if(one && two){
                sb.append(2).append("\n");

                for(int i=0;i<n;i++){
                    sb.append(color[i]).append(" ");
                }
            }else{
                sb.append(1).append("\n");
                
                for(int i=0;i<n;i++){
                    sb.append(1).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
