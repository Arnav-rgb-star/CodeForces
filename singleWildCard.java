import java.io.*;
import java.util.*;

public class singleWildCard{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        String s=br.readLine();
        String t=br.readLine();


        int index=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println(s.equals(t)?"YES":"NO");
            return; 
        }

        if(m< n-1){
            System.out.println("NO");
            return;
        }

        for(int i=0;i<index;i++){
            if(s.charAt(i)!=t.charAt(i)){
                System.out.println("NO");
                return;
            }
        }

        int i=n-1,j=m-1;
        while(i>index){
            if(s.charAt(i)!=t.charAt(j)){
                System.out.println("NO");
                return;
            }
            i--;
            j--;
        }

        System.out.println("YES");
    }
}