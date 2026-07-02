import java.io.*;
import java.util.*;

public class doubleString{
    public static void main(String[] args)throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder sb= new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String str[]=new String[n];
            HashSet<String> set = new HashSet<>();

            for(int i=0;i<n;i++){
                str[i]=br.readLine();
                set.add(str[i]);
            }
            for(int i=0;i<n;i++){
                boolean can=false;
                for(int j=0;j<str[i].length();j++){
                    String first = str[i].substring(0,j);
                    String second = str[i].substring(j);
                    if(set.contains(first) && set.contains(second)){
                        can=true;
                        break;
                    }
                }
                if(can) sb.append(1);
                else sb.append(0);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}