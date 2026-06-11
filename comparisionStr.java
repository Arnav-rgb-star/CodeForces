import java.util.*;

public class comparisionStr{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        int[] diff=new int[t];

        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();

            String string = in.next();
            char[]str = string.toCharArray();

            int count=1;
            int max = 1;
            for(int i=0 ;i<str.length-1 ; i++){
                if(str[i]==str[i+1]){
                    ++count;
                }else{
                    count=1;
                }
                if(count>max){
                max=count;
                }
            }
            diff[m]=max+1; 
        }
        for(int i=0; i<diff.length ; i++){
            System.out.println(diff[i]);
        }
    }
} 