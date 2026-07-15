
import java.io.*;
import java.util.*;
public class binaryCut{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String a = br.readLine();
            int cut=1;
            int extra=0;
            for(int i=1;i<a.length();i++){
                if(a.charAt(i)<a.charAt(i-1)) ++cut;
                if(a.charAt(i)=='1' && a.charAt(i-1)=='0') ++extra;
            }
            if(extra>0) --extra;

            sb.append(cut+extra).append("\n");
        }
        System.out.println(sb);
    }
}
