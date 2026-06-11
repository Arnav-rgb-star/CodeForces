 
import java.util.*;
import java.io.*;
public class MakeThemEqual {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
 
        while(t-->0){
            int n = in.nextInt();
            String ch = in.next();
            String str = in.next();
            
            int start=-1,end=-1,x=-1;
            for(int i=0;i<n;i++){
                if(str.charAt(i)!=ch.charAt(0)){
                    start=i;
                    break;
                }
            }
            for(int i=n-1;i>=0;i--){
                if(str.charAt(i)!=ch.charAt(0)){
                    end=i;
                    break;
                }   
            }
            
            if(start==-1 && end==-1){
                System.out.println(0);
                System.out.println();
                continue;
            }
            if(start==end && start!=-1){
                System.out.println(1);
                if(start==n-1){
                    System.out.println(n-1);
                }else{
                    System.out.println(start+2);
                }
                continue;
            }
            for(int i=n-1;i>=0;i--){
                if(str.charAt(i)==ch.charAt(0)){
                    x=i;
                    ++x;
                    break;
                }
            }
            if(x==-1){
                System.out.println(2);
                System.out.println((end+1) + " " + (end));
                continue;
            }
            boolean can=true;
            if(x>=end){
                System.out.println(1);
                System.out.println(x);
                continue;
            }

            for(int i=start+1 ;i<=end+1;i++){
                if(i!=x && i%x==0){
                    can=false;
                    break;
                }
            }
            if(!can){
                System.out.println(2);
                System.out.println((end+1) + " " + (end));
            }else{
                System.out.println(1);
                System.out.println(x);
            }
        }
    }
}