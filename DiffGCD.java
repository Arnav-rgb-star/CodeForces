
import java.io.*;
import java.util.*;
public class DiffGCD {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(b.readLine());
        for(int m=0;m<t;m++){
            StringTokenizer st = new StringTokenizer(b.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            boolean flag=true;
            for(int i=1;i<=n;i++){
                int minMul = (int) Math.ceil(((double)(l)) / ((double)(i)));
                int minVal = minMul * i;
                if(minVal>=l && minVal<=r){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
                if(flag){
                    System.out.println("YES");
                    for(int i=1;i<=n;i++){
                        int minMul = (int) Math.ceil(((double)(l)) / ((double)(i)));
                        System.out.print(i * minMul + " ");
                    }
                    System.out.println();
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }

