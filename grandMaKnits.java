
import java.io.*;
public class grandMaKnits {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n=Integer.parseInt(br.readLine());
            String str = br.readLine();

            int val=Integer.MAX_VALUE;

            for(int i=0;i<26;i++){
                char ch = (char)(i+'a');
                int count=0;
                int l=0;
                int r=n-1;

                while(l<r){
                    if(str.charAt(l)==str.charAt(r)){
                        ++l;
                        --r;
                    }
                    else if(str.charAt(r)==ch){
                        --r;
                        ++count;
                    }
                    else if(str.charAt(l)==ch){
                        ++l;
                        ++count;
                    }
                    else{
                        count=Integer.MAX_VALUE;
                        break;
                    }
                }
                val = Math.min(val,count);
            }
            if(val==Integer.MAX_VALUE) sb.append(-1).append("\n");
            else sb.append(val).append("\n");
        }
        System.out.println(sb);
    }
}
