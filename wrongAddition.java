import java.io.*;
import java.util.*;
public class wrongAddition {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(test-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            StringBuilder a = new StringBuilder(String.valueOf(x));

            long y = Long.parseLong(st.nextToken());
            StringBuilder s = new StringBuilder(String.valueOf(y));

            boolean possible=true;
            int n = s.length();
            int m = a.length();

            while(m!=n) {
                a.insert(0,'0');
                ++m;
            } 

            int i=(s.length()-1);
            int j = (a.length()-1);
            StringBuilder str = new StringBuilder();

            while(i>=0 && j>=0){
                if((s.charAt(i)-'0') < (a.charAt(j)-'0') && (i==0 || s.charAt(i-1)!='1')){
                    possible=false;
                    break;
                }
                else if((s.charAt(i)-'0') < (a.charAt(j)-'0')){
                    int diff = 10 + (s.charAt(i)-'0') - (a.charAt(j)-'0');
                    char dig = (char)('0' + diff);
                    str.append(dig);
                    i-=2;
                    --j;
                }else{
                    int diff = (s.charAt(i) - '0') - (a.charAt(j) - '0');
                    char dig = (char)('0' + diff);
                    str.append(dig);
                    --i;
                    --j;
                }
            }

            if(i<0 && j>=0){
                while(j>=0){
                    if(a.charAt(j)!='0'){
                        possible=false;
                        break;
                    }
                    --j;
                }
            }
            
            if(!possible){
                sb.append(-1).append("\n");
            }else{
                long b = Long.parseLong(str.reverse().toString());
                sb.append(b).append("\n");
            }

        }
        System.out.print(sb);
    }
}
