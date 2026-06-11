
import java.util.*;
import java.io.*;
public class threeAct {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        ArrayList<Long> ans = new ArrayList<>();
        for(int m=0;m<t;m++){
            int n = Integer.parseInt(br.readLine());

            ArrayList<int []> a = new ArrayList<>();
            ArrayList<int []> b = new ArrayList<>();
            ArrayList<int []> c = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                int ele = Integer.parseInt(st.nextToken());
                a.add(new int[]{ele,i});
            }
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                int ele = Integer.parseInt(st.nextToken());
                b.add(new int[]{ele,i});
            }
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                int ele = Integer.parseInt(st.nextToken());
                c.add(new int[]{ele,i});
            }
            a.sort((Comparator.comparingInt((int []p)->p[0])).reversed());
            b.sort((Comparator.comparingInt((int []p)->p[0])).reversed());
            c.sort((Comparator.comparingInt((int []p)->p[0])).reversed());

            ArrayList<int []> x = new ArrayList<>();
            ArrayList<int []> y = new ArrayList<>();
            ArrayList<int []> z = new ArrayList<>();

            for(int i=0;i<3;i++){
                x.add(new int[]{a.get(i)[0],a.get(i)[1]});
            }
            
            for(int i=0;i<3;i++){
                y.add(new int[]{b.get(i)[0],b.get(i)[1]});
            }
                        
            for(int i=0;i<3;i++){
                z.add(new int[]{c.get(i)[0],c.get(i)[1]});
            }

            long max=-1;

            for(int i=0;i<3;i++){  
                for(int j=0;j<3;j++){
                    if(x.get(i)[1]!=y.get(j)[1]){
                        for(int k=0;k<3;k++){
                            if(y.get(j)[1]!=z.get(k)[1] && x.get(i)[1]!=z.get(k)[1] && x.get(i)[1]!=y.get(j)[1]){
                                max = Math.max(max,(long)(x.get(i)[0] + y.get(j)[0] + z.get(k)[0]));
                            }
                        }
                    }
                }
            }
            ans.add(max);
        }

        for(int i=0;i<t;i++) System.out.println(ans.get(i));
    }
}
