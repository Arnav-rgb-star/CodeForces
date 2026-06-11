import java.util.*;
public class ValAgainst{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<String> list = new LinkedList<>();
        for(int k=0 ;k<t ; k++){
            int n = in.nextInt();
            int[] a= new int[n];
            for(int i=0; i<n ; i++){
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            boolean found=false;
            for(int i=1 ; i<n ; i++){
                if(a[i-1]==a[i]){
                    found=true;
                    break;
                }
            }
            if(found){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
        }
        for(int k=0 ; k<t ; k++){
            System.out.println(list.get(k));   
        }
    }
}