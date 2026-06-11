
import java.util.*;
import java.io.*;

public class CardDeck {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int [] q = new int[k];
            st = new StringTokenizer(br.readLine());
            int [] a = new int[n];

            int [] store = new int[51];

            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                if(store[a[i]]==0){
                store[a[i]] = i+1;
                }
            }

            st = new StringTokenizer(br.readLine());

            for(int i=0;i<k;i++) q[i] = Integer.parseInt(st.nextToken());
            
            for(int i=0;i<k;i++){
    
                for(int j=1;j<=50;j++){
                    if((store[j] <  store[q[i]]) && store[j]!=0){
                        ++store[j];
                    }     
                }
                System.out.print(store[q[i]] + " ");
                store[q[i]] = 1;
            }
            System.out.println();
        }
    }    

