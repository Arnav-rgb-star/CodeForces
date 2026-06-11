
import java.util.*;
import java.io.*;
public class lostCivilization {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int []a=new int[n];

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            HashSet<Integer> set = new HashSet<>();

            int cnt=1;
            set.add(a[0]);
            for(int i=1;i<n;i++){
                if(Math.abs(a[i]-a[i-1])>1){
                    if(set.size()>0 && set.contains(a[i]) && set.contains(a[i]-1) && (a[i]<a[i-1])){

                    }else{
                        ++cnt;
                        set.clear();
                        set.add(a[i]);
                    }
                }else if(a[i]==a[i-1]){
                    if(set.size()>0 && set.contains(a[i]-1)){

                    }else{
                        ++cnt;
                        set.clear();
                        set.add(a[i]);
                    }
                }else{
                    if(a[i]-a[i-1]==1){
                        set.add(a[i]);
                    }else{
                        if(a[i-1]-a[i]==1 && set.size()>0 && set.contains(a[i]) && set.contains(a[i]-1)){

                        }
                        else{
                        set.clear();
                        set.add(a[i]);
                        ++cnt;
                        }
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
