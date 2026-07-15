
import java.io.*;
import java.util.*;
public class palindromeMex {
    
    public static boolean check(int a[],int p,int q,int m){

        int cnt=0;

        int l=p;
        int r=q;

        while(l<=r){
            if(a[l]!=a[r]) return false;
            ++l;
            --r;
        } 

        while(l>0 && r<(a.length-1) && a[l-1]==a[r+1]){
            --l;
            ++r;
        }
        boolean seen[]=new boolean[a.length];
        for(int i=l;i<=r;i++){
            if(a[i]<m && !seen[a[i]]){
                ++cnt;
                seen[a[i]]=true;
            }
        }
        return cnt==m;
    }

    static boolean possible(ArrayList<ArrayList<Integer>> idx,int a[],int m){
        int i = idx.get(0).get(0);
        int j = idx.get(0).get(1);

        if(check(a,i,i,m)) return true;
        if(check(a,j,j,m)) return true;
        if(check(a,i,j,m)) return true;

        return false;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a[]=new int[2*n];
            ArrayList<ArrayList<Integer>> idx = new ArrayList<>();
            for(int i=0;i<n;i++){
                idx.add(new ArrayList<>());
            }

            for(int i=0;i<2*n;i++){
                a[i]=Integer.parseInt(st.nextToken());
                idx.get(a[i]).add(i);
            }

            int l=1;
            int r=n;
            int ans=0;

            while(l<=r){
                int m=l+(r-l)/2;
                if(possible(idx,a,m)){
                    ans=m;
                    l=m+1;
                }else r=m-1;
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
