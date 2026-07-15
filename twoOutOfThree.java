
import java.io.*;
import java.util.*;
public class twoOutOfThree {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a[][]=new int[n][2];
            for(int i=0;i<n;i++){
                a[i][0]=Integer.parseInt(st.nextToken());
                a[i][1]=i;
            }
            boolean one=false;
            boolean two = false;
            int b[][]=new int[n][2];
            b[0][0]=1;
            int p=-1;
            Arrays.sort(a,(x,y)->Integer.compare(x[0],y[0]));

            for(int i=0;i<n;i++){
                if(i>0 && a[i-1][0]==a[i][0]){
                    if(!one){
                        p=a[i-1][0];
                        b[i][0]=2;
                        b[i][1]=a[i][1];
                    }else{
                        two=true;
                        b[i][0]=3;
                        b[i][1]=a[i][1];
                    }
                }else{
                    if(p!=-1) one=true;
                    b[i][0]=1;
                    b[i][1]=a[i][1];
                }
            }
            Arrays.sort(b,(x,y)->Integer.compare(x[1],y[1]));
            if(one && two){
                for(int i=0;i<n;i++) sb.append(b[i][0]+" ");
                sb.append("\n");
            }

            else sb.append(-1).append("\n");
        }

        System.out.println(sb);
    }
}
