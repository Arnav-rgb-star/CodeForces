
import java.io.*;
import java.util.*;
public class arrTheSheep {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            ArrayList<Integer> pos = new ArrayList<>();

            for(int i=0;i<n;i++){   
                if(s.charAt(i)=='*') pos.add(i);
            }
            if(pos.size()<=1){
                sb.append(0).append("\n");
                continue;
            }
            long dist=0;
            long start=pos.get(pos.size()/2)-pos.size()/2;
            for(int i=0;i<pos.size();i++){
                long p=start+i;
                dist+=Math.abs(pos.get(i)-p);
            }
            sb.append(dist).append("\n");
        }
        System.out.println(sb);
    }
}
