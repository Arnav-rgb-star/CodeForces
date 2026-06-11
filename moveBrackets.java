import java.util.*;
public class moveBrackets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] a = new int[t];

            for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            in.nextLine();
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder(str);
            ArrayList<Integer> list = new ArrayList<>();
            int i=0,count=0;

            while(i<sb.length()-1){
                if(sb.charAt(i)=='('){
                    int j = i+1;
                    while( j < sb.length()){
                        if(sb.charAt(j)==')' && !list.contains(j)){
                            count+=2;
                            list.add(j);
                            break;
                        }
                        else{
                            ++j;
                        }
                    }
                }
                    ++i;
            }
            a[m] = (sb.length() - count)/2;
        }
            for(int i=0 ; i<t ; i++){
                System.out.println(a[i]);
            }
    }
}
