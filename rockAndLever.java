
import java.util.*;
import java.io.*;
public class rockAndLever {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[]=new int[n];
            int bits[]=new int[n];
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                if(a[i]==0){
                    bits[i]=1;
                }else{
                    bits[i] = (int)(Math.log(a[i])/Math.log(2)) + 1;
                    map.put(bits[i],map.getOrDefault(bits[i],0)+1);
                }
            }

            long count=0;
            for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
                int key = entrySet.getKey();
                int val = entrySet.getValue();
                
                count+=((long)(val)*(val-1))/2;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
