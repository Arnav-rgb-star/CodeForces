import java.util.*;
public class makingItInc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int m=0 ; m<t ; m++){
            int n = in.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            for(int i=0 ; i<n ; i++){
                list.add(in.nextLong());
            }
            int count = 0;
            for(int i=0; i<n-1 ; i++){
                if(list.get(i)==0 && list.get(i+1) ==0){
                    count = -1;
                    break;
                }
                else if(list.get(i)>=list.get(i+1)){
                    list.set(i,list.get(i)/2);
                    i = -1;
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}