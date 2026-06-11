

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class alyonaAndFridge {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int []a=new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
        int k=0;

        for(int i=0;i<n;i++){
            int temp[] = Arrays.copyOfRange(a,0,i+1);
            Arrays.sort(temp);
            int cnt=0;

            for(int j=temp.length-1;j>=0;j-=2){
                cnt+=temp[j];
            }
            if(cnt<=h) k=(i+1);
            else break;
        }

        System.out.println(k);
    }
}
