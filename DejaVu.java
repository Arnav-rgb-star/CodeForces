import java.util.*;
import java.io.*;
public class DejaVu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            ArrayList<int[]> list = new ArrayList<>();
            int x[] = new int[q];

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int k = Integer.parseInt(st.nextToken());
                list.add(new int[]{k,i});                
            }
              st = new StringTokenizer(br.readLine());
            for(int i=0;i<q;i++){
                x[i] = Integer.parseInt(st.nextToken());
            }
            list.sort(Comparator.comparing(k->k[0]));
            int old_tb=31;

            for(int i=0;i<q;i++){
                if(old_tb<=x[i]) continue;

                for(int j=n-1;j>=0;j--){
                    if((list.get(j)[0]&1) == 1) continue;
                    else{
                        if( Math.pow(2, x[i])  > list.get(j)[0] ){
                            continue;
                        }
                        else if(list.get(j)[0] % Math.pow(2,x[i]) == 0){
                            list.get(j)[0]+= Math.pow(2,x[i]-1); 
                        }                        
                    }
                }
                old_tb = x[i];
            }
            list.sort(Comparator.comparing(k->k[1]));
            for(int i=0;i<n;i++){
                System.out.print(list.get(i)[0] + " ");
            }
            System.out.println();
        }
    }
}