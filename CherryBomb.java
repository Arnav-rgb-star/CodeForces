

import java.util.*;
public class CherryBomb {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
           int n=in.nextInt();
           int k=in.nextInt();
           int[][] a = new int[2][n];
           
           for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
           }
           ArrayList<int[]> pairs = new ArrayList<>();
           for(int i=0;i<n;i++){
            pairs.add(new int[]{a[0][i],a[1][i]});
           }
           pairs.sort(Comparator.comparingInt(x->x[0]));
           for(int i=0;i<pairs.size();i++){
            a[0][i]=pairs.get(i)[0];
            a[1][i]=pairs.get(i)[1];
           }
           
           int ones=0;
           for(int i=0;i<n;i++){
            if(a[1][i]==-1){
                ++ones;
            }
           }
           boolean wrong=false;
           int count=0,sum=-1,prev=-1;

           for(int i=0;i<n;i++){
                if(a[1][i]!=-1){
                    sum= a[0][i]+a[1][i] ;
                    ++count;
                }
                if(prev!=-1 && sum!=prev){
                    wrong=true;
                    break;
                }
                prev=sum;
           }
           if(wrong){
                ans.add(0);
                continue;
           }
           if(count==0 && ones==a[0].length){
           int sub = k-(a[0][n-1]-a[0][0]) + 1;
           ans.add(sub);
           continue;
           }
           int min=Integer.MAX_VALUE,index = -1;
           for(int i=0;i<n;i++){
            if(a[1][i]==-1 && min>a[0][i]){
                min=a[0][i];
                index=i;
            }
           }
           int left = sum-min;
           if(a[0][n-1]>sum){
                ans.add(0);
                continue;
            }
           if(ones!=pairs.size() && k>=left){
                ans.add(1);
           }
           else{
                ans.add(0);
           }
        //    System.out.println();
        //    System.out.println(count + " " + sum + " " + ones + " " + left + " " + index + " " + min);
        //    System.out.println();

        }
        
        for(int m=0;m<t;m++){
            System.out.println(ans.get(m));
        }
    }
}
