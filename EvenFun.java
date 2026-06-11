
import java.util.*;
import java.io.*;

public class EvenFun {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int t = Integer.parseInt(br.readLine());
      ArrayList<Integer> ans = new ArrayList<>();
      
      for(int m=0;m<t;m++){
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) a[i]=Integer.parseInt(st.nextToken()); 
        
        int left=0;
        int right=n-1;
        while(left<right){
          int temp = a[left];
          a[left]=a[right];
          a[right]=temp;

          ++left;
          right--;
        }


        int seg=1,ops=0;

        while(seg<n){
          if(a[seg]==a[0]){
            ++seg;
            continue;
          }else{
            ++ops;
            seg*=2;
          }
        }
          ans.add(ops);
      }
      for(int i=0;i<t;i++) System.out.println(ans.get(i));
  }
}