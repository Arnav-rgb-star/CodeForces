

import java.io.*;
import java.util.*;

public class subseqInv{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());

            int a[]=new int[n];
            int b[]=new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            int one=0;
            int zero=0;

            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(a[i]==0) ++zero;
            }

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                b[i]=Integer.parseInt(st.nextToken());
                if(b[i]==1) ++one;
            }

            int diff=0;
            int down=0;

            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    diff++;

                    if(a[i]==1 && b[i]==0){
                        down++;
                    }
                }
            }

            if(diff==0)  sb.append(0).append("\n");

            else if(down%2==1)  sb.append(1).append("\n");
            
            else if(one==n || zero==n)  sb.append(-1).append("\n");
            else sb.append(2).append("\n");
            
        }

        System.out.println(sb);
    }
} 
    

