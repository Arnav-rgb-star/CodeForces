
import java.io.*;
import java.util.*;
public class substringSort {
    static int substring(String a, String b) {

        for (int i=0;i<=b.length()-a.length();i++){

            int j;
            for (j=0;j<a.length();j++){
                if (b.charAt(i + j)!= a.charAt(j)) {
                    break;
                }
            }
            if (j == a.length()) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[]=new String[n];

        for(int i=0;i<n;i++) str[i]=br.readLine();

        Arrays.sort(str,(a,b)->Integer.compare(a.length(), b.length()));

        String prev = str[0];
        int cnt=1;
        for(int i=1;i<n;i++){
            cnt+= substring(prev,str[i]);
            prev=str[i];
        }
        if(cnt==n) {
            System.out.println("YES");
            for(String s : str){
                System.out.println(s);
            }
        }
        else System.out.println("NO");
    }
}
