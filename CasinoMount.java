
import java.util.*;
public class CasinoMount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0 ; i<t ; i++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] days = new int[n];
            for(int j=0 ; j<n ; j++){
                days[j] = in.nextInt();
            }
            int count=0;
            int hike=0;
            for(int j=0 ;j<n ;j++){
                if(days[j]==0){
                    ++count;
                    if((count==k && j==(n-2)) || (count==k && j==(n-1))){
                        ++hike;
                        count=0;
                        break;
                    }
                    else if(count==k && j!=(n-1)){
                        ++hike;
                        count=0;
                        ++j;
                    }
                }
                    else{
                        count=0;
                    }
            }
            list.add(hike);
        }

        for(int i=0 ; i<t ; i++){
            System.out.println(list.get(i));
        }
    }
}
