
import java.util.*;
public class ChooseDiff {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<String> list = new LinkedList<>();    
        for(int v=0 ; v<t ; v++){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];

            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i] = in.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            ArrayList<Integer> listA = new ArrayList<>();
            ArrayList<Integer> listB = new ArrayList<>();
            int countA=0,countB=0;
            int prev = -1;
                for(int i = 0 ; i < n && a[i] <= k; i++){
                    if(a[i] != prev){
                    listA.add(a[i]);
                    countA++;
                    prev = a[i];
                }
            }

            int prev2 = -1;
            for(int i = 0 ; i < m && b[i] <= k; i++){
                if(b[i] != prev2){
                    listB.add(b[i]);
                    countB++;
                    prev2 = b[i];
                }
            }

            int common = 0;
            int i = 0;
            int j = 0;
            while(i < listA.size() && j < listB.size()){
                int x = listA.get(i);
                int y = listB.get(j);
                if(x == y){
                    common++;
                    i++;
                    j++;
                } else if(x< y){
                    i++;
                } else {
                    j++;
                }
            }
            countA-=common;
            countB-=common;
            boolean fail = false;
            while(countA < (k/2) || countB < (k/2)){
                if(countA < countB){
                    countA+=1;
                    --common;
                    if(common<0){
                        list.add("NO");
                        fail = true;
                        break;
                    }
                }
                else{
                    countB+=1;
                    --common;
                    if(common<0){
                        list.add("NO");
                        fail = true;
                        break;
                    }
                }
            }
            if(!fail){ 
            if( countA== (k/2) && countB == (k/2)){
                list.add("YES");
            }
            else{
                list.add("NO");
            }
        }
        }

        for(int v=0 ; v<t ; v++){
            System.out.println(list.get(v));
        }
    }
}
