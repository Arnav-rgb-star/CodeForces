
import java.util.*;
public class MonstersEasy {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Long> list = new LinkedList<>();

        for(int k=0 ; k<t ; k++){
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = in.nextInt(); 
        }
        Arrays.sort(arr);
        int index=-1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]==1){
                index=i;
            }
        }
        if(index==arr.length-1){
            list.add(0L);
            continue;
        }
        long m=1;
        long count=0;
        if(index!=-1){
            for(int i = index+1 ; i<n ; i++){
                if(arr[i] > m){
                ++m;
                count+= arr[i] - m;
                }
            }
        }
        else{
            m=0;;
            for(int i=0 ; i<n ; i++){
                
                if(arr[i] > m){
                ++m;
                count+= arr[i] - m;
                }
            }
        }
        list.add(count);

        }

        for(int k=0 ; k<t ; k++){
            System.out.println(list.get(k));
        }
    }
}
