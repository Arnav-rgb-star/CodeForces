
import java.io.*;
import java.util.*;
public class frogJumps {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String s = br.readLine();
            ArrayList <Integer> diff = new ArrayList<>();
            diff.add(0);

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='R') diff.add(i+1);
            }
            diff.add(s.length()+1);
            int d=0;

            for(int i=1;i<diff.size();i++){
                d=Math.max(d,diff.get(i)-diff.get(i-1));
            }
            sb.append(d).append("\n");
        }
        System.out.println(sb);
    }
}
