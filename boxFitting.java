
import java.util.*;
import java.io.*;

public class boxFitting {

    static boolean check(int a,int w){ 
        if(a<=w) return true;
        else return false;
        
    }

    static boolean left(int a,TreeMap<Integer,Integer>tree){

        Integer key=tree.ceilingKey(a);
        if(key==null) return false;

        int count=tree.get(key);

        if(count==1) tree.remove(key);
        else tree.put(key,count-1);

        int newLeft=key-a;

        if(newLeft>0){
            tree.put(newLeft,tree.getOrDefault(newLeft,0)+1);
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        ArrayList<Integer> ans = new ArrayList<>();
        
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            int a[] = new int[n];
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken());

            Arrays.sort(a);
            TreeMap<Integer,Integer> tree = new TreeMap<>();
            
            int h=1,k=w;
            for(int i=n-1;i>=0;i--){
                if(check(a[i],w)){
                    w-=a[i];
                }else if(left(a[i],tree)){

                }else{
                    tree.put(w,tree.getOrDefault(w,0)+1);
                    h++;
                    w=k-a[i];
                }
            }
            ans.add(h);
        }

        for(int i=0;i<ans.size();i++) System.out.println(ans.get(i));

        System.out.println();
    }
}
