
import java.util.*;
import java.io.*;
public class DoraSearch {

    public static boolean isValid(TreeSet<Integer> set,int i){
        Iterator<Integer> itr = set.iterator();
        if(itr.next().equals(i)){
            return true;
        }
        if((((TreeSet<Integer>) set).last()).equals(i)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] a = new int[n];
            TreeSet<Integer> set = new TreeSet<>();

            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                set.add(a[i]);
            }

            int l=0;
            int r=n-1;

            while(l<r){
                if(isValid(set,a[l])){
                    set.remove(a[l]);
                    ++l;
                    continue;
                }
                if(isValid(set,a[r])){
                    set.remove(a[r]);
                    --r;
                    continue;
                }
                break;
            }
            if(l<r){
                System.out.println((l+1) + " " + (r+1));
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
