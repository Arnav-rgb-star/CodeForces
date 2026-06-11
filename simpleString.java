
import java.util.*;
import java.io.*;
public class simpleString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        int n=sb.length();
            for(int i=1;i<n;i++){
                if(sb.charAt(i)==sb.charAt(i-1)){
                for(char ch ='a';ch<'z';ch++){
                    if((i+1 ==n || ch!=sb.charAt(i+1)) && ch!=sb.charAt(i-1)){
                        sb.setCharAt(i,ch);
                        break;
                    }
                }
            }
            }
            System.out.println(sb);
        
    }
}
