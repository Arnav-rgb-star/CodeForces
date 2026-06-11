
import java.io.*;
import java.util.*;
public class euclidSeq {
    public static boolean check(int a[],int x,int y){
        ArrayList<Integer> list = new ArrayList<>();
        int n=a.length;

        list.add(x);
        list.add(y);

        for(int i=1;i<(n-1);i++){
            if(list.get(i) == 0) return false;
            list.add(list.get(i-1)%list.get(i));
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(list.get(i)==a[i]) ++cnt;
        }
        if(cnt==n) return true;
        return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());
            Arrays.sort(a);

            for(int i=0;i<n/2;i++){
                int temp=a[i];
                a[i]=a[n-1-i];
                a[n-1-i]=temp;
            }

            boolean out=false;

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    boolean can = check(a,a[i],a[j]);
                    if(can){
                        out=true;
                        sb.append(a[i] + " " + a[j]).append("\n");
                        break;
                    }
                    if(out) break;
                }
            }
            if(!out) sb.append(-1).append("\n");
        }
        System.out.println(sb);
    }
}
