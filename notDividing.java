import java.util.*;

public class notDividing {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    for(int m=0 ; m<t ; ++m){
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            a.add(in.nextInt());
        }
        for(int i=0 ; i<n-1 ; i++){
            if(a.get(i) == 1){
                int new_value = a.get(i);
                a.set(i,++new_value);
            }
            if(i>=1){
            while(a.get(i) % a.get(i-1) == 0){
                int new_value = a.get(i);
                a.set(i,++new_value);
            }
        }
            while(a.get(i+1) % a.get(i) == 0){
                int new_value = a.get(i+1);
                a.set(i+1,++new_value);
            }
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
}
