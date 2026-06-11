
import java.io.*;
import java.util.*;
public class addModuloTen {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n];
            StringTokenizer st =new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if((a[i]%2) !=0) a[i]+=a[i]%10;
            }
            boolean lassi=true;
            int v=0,cnt=1;

            for(int i=0;i<n;i++){
                if(cnt==0 && v!=a[i]){
                    lassi=false;
                    break;
                }
                if(cnt==1 && a[i]%10==0){
                    cnt--;
                    v=a[i];
                }
            }
            if(!lassi){
                sb.append("NO").append("\n");
                continue;
            }
            for(int i=0;i<n;i++){
                while((a[i] % 10!=0) &&(a[i]%10) !=2) a[i]+=a[i]%10;

                a[i]=a[i]%20;
            }
            boolean equal=true;
            for(int i=1;i<n;i++){
                if(a[i]!=a[0]){
                    equal=false;
                    break;
                }
            }
            if(equal) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
