
import java.util.*;
public class DistinctSplit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[] = new int[t];

        for(int i=0 ; i<t ; i++){

        int n =in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int unique=0;

        for(int j=0 ; j<n ; j++){
            char ch = str.charAt(j);
            if(!list.contains(ch)){
                ++unique;
                list.add(ch);
            }
            prefix[j] = unique;
        }
        unique=0;
        list.clear();
        for(int j=n-1 ; j>=0 ; j--){
            char ch = str.charAt(j);
            if(!list.contains(ch)){
                ++unique;
                list.add(ch);
            }
            suffix[j] = unique;
        }
        int max=0;
        for(int j=0 ; j<n-1 ; j++){
            max=Math.max(max,(prefix[j]+suffix[j+1]));
        }

        arr[i] = max;
        }

        for(int i=0 ; i<t ; i++){
        System.out.println(arr[i]);
        }
    }
}
