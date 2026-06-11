
import java.util.*;
import java.io.*;
public class strangeMachine {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            int []a = new int[q];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<q;i++) a[i] = Integer.parseInt(st.nextToken());
            boolean b = s.contains("B");

            for(int i=0;i<q;i++){
                if(!b){
                    System.out.println(a[i]);
                    continue;
                }
                long time=0;
                int pos=0;
                long x=a[i];

                while(x>0){
                    if(s.charAt(pos)=='A'){
                        x-=1;
                    }
                    else{
                        x=x/2;
                    }
                    pos=(pos+1)%n;
                    time++;
                }
                System.out.println(time);
            }
        }
    }
}
