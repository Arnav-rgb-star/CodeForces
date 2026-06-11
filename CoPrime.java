

import java.util.*;
import java.io.*;
public class CoPrime {

public static int gcd(int a,int b){
    if(b==0) return a;
    else return gcd(b,a%b);
}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> ans = new ArrayList<>();

        for(int k=0;k<t;k++){
            int n = Integer.parseInt(br.readLine());
            int [] a =new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer,Integer> index = new HashMap<>();

            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                index.put(a[i],i+1);
            }
            Map<Integer,ArrayList<Integer>> map = new HashMap<>();
            for(int i=1;i<=1000;i++){
                for(int j=1;j<=1000;j++){
                    if(gcd(i,j)==1){
                        if(!map.containsKey(i)){
                        map.put(i,new ArrayList<>());
                        }
                        map.get(i).add(j);
                    }                  
                }
            }
            int max=-1;
            for(int key1 : map.keySet()){
                if (!index.containsKey(key1)) continue;
                ArrayList<Integer> list = map.get(key1);
                for(int key2 : list){
                    if(index.containsKey(key2)){
                        max = Math.max(max,index.get(key1) + index.get(key2));
                    }
                }
            }
            ans.add(max);
        }

        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
