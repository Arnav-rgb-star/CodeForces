
import java.io.*;
import java.util.*;
public class seatingArrangements {

    public static int func(String str,int a,int x,int s){
        int t=0;
        int extro=0;
        int start=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='I'){
                if(start!=x){
                    ++start;
                    ++t;
                }
            }else if(ch=='E'){
                if((s-1)*(start)>extro){
                    ++t;
                    ++extro;
                }
            }else{
                if(a>0){
                    --a;
                    if(start!=x){
                        ++t;
                        ++start;
                    }
                }else{
                    
                    if((s-1)*start>extro){
                        ++extro;
                        ++t;
                    }
                }
            }
        }
        return t;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            String str = br.readLine();

            int a=0;
            for(int i=0;i<n;i++) if(str.charAt(i)=='A') ++a;
            int cnt=0;

            for(int i=0;i<=a;i++){
                cnt=Math.max(cnt,func(str,i,x,s));
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
