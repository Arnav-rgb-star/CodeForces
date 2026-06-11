

import java.util.*;
public class arrayGame {
    public static int bs(ArrayList<Long> list,long v){
        int s=0;
        int e=list.size()-1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(list.get(m)<v) s=m+1;
            else if(list.get(m)==v) return m;
            else e=m-1;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();

            for(int i=0;i<n;i++) a.add(sc.nextLong());
            Collections.sort(a);
            
            if(k>=3){
                sb.append(0).append("\n");
            }else if(k==1){
                long diff = a.get(0);

                for(int i=1;i<n;i++) diff=Math.min(diff,a.get(i)-a.get(i-1));
                sb.append(diff).append("\n");
            }else{
                long minDiff = a.get(0);
                long diff=0;

                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                        diff=a.get(j)-a.get(i);
                        int pos = bs(a,diff);
                        minDiff = Math.min(minDiff,diff);
                        if(pos<n){
                            minDiff = Math.min(minDiff,Math.abs(a.get(pos)-diff));
                        }
                        if(pos>0){
                            minDiff = Math.min(minDiff,Math.abs(a.get(pos-1)-diff));
                        }
                    }
                }
                sb.append(minDiff).append("\n");
            }
        }

        System.out.println(sb);
    }
}
