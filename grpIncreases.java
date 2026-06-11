

import java.io.IOException;
import java.util.*;
public class grpIncreases {
    public static void main(String[] args)throws IOException {
        Scanner in = new Scanner(System.in);
        int tst = in.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while(tst-->0){
            int n = in.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++) a[i]=in.nextInt();
            ArrayList<Integer> s = new ArrayList<>();
            ArrayList<Integer> t = new ArrayList<>();
            int ptr1=0;
            int ptr2=-1;
            s.add(a[0]);

            for(int i=1;i<n;i++){
                int lastS=s.get(ptr1);
                int lastT= t.size()==0 ? (n+1):t.get(ptr2);

                if(lastS<=lastT){
                    if(lastS>=a[i]){
                        s.add(a[i]);
                        ++ptr1;
                    }else if(lastT>=a[i]){
                        t.add(a[i]);
                        ++ptr2;
                    }else{
                        s.add(a[i]);
                        ++ptr1;
                    }
                }else{
                    if(lastT>=a[i]){
                        t.add(a[i]);
                        ++ptr2;
                    }else if(lastS>=a[i]){
                        s.add(a[i]);
                        ++ptr1;
                    }else{
                        t.add(a[i]);
                        ++ptr2;
                    }
                }
            }
            int penalty=0;
            if(t.size()!=0){
                for(int i=1;i<t.size();i++){
                    if(t.get(i-1)<t.get(i)) ++penalty;
                }
            }

            for(int i=1;i<s.size();i++){
                if(s.get(i-1)<s.get(i)) ++penalty;
            }
            sb.append(penalty).append("\n");
        }
        
        System.out.println(sb);
    }
}
