import java.util.*;
public class WaterLvL { 
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    ArrayList<String> list = new ArrayList<>();

    for(int m=0 ; m<t ; m++){
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n ; i++){
            h[i] = in.nextInt();
        }
        boolean survive = true;;
        int value = h[k-1];
        int index = -1;
        Arrays.sort(h);
        for(int i=0 ; i<n ; i++){
            if(h[i] == value){
                index=i;
            }
        }
        int diff=0,prev=0,water=1;
        if((h[index] - water) < 0){
            list.add("NO");
            continue;
        }

        for(int i=index ; i<n-1 ; i++){
        diff = (h[i+1]-h[i]) + diff;
        water = diff;
        if((h[i] - water) < 0){
            survive = false;
            break;
        }
            ++water;
            prev = diff;
        }
        if((h[n-1] - water) < 0){
            list.add("NO");
            continue;
        }
        if(survive){
            list.add("YES");
        }
        else{
            list.add("NO");
        }

    }
    for(int m=0 ; m<t ; m++){
        System.out.println(list.get(m));
    }

   } 
}
