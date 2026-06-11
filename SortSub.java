
import java.util.*;
import java.io.*;
public class SortSub {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tb = Integer.parseInt(br.readLine());

        while(tb-- >0){
            int n = Integer.parseInt(br.readLine());
            int [] a = new int[n];
            int [] b = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                b[i] = Integer.parseInt(st.nextToken());
            }
            int l = 0;
            int r = n - 1;
            while (l<n && a[l] == b[l]) {
                l++;
            }
            while (r>=0&& a[r]==b[r]) {
                r--;
            }
            while (l>0 && b[l - 1] <= b[l]) {
                l--;
            }
            while (r+1< n && b[r] <=b[r+1]) {
                r++;
            }
            int left =l;
            int right = r;

            System.out.println((left + 1) + " " + (right + 1));          
        }
    }
}
