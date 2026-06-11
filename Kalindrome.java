
import java.util.*;
import java.io.*;

public class Kalindrome {

    static boolean isPalindrome(ArrayList<Integer> list , int ele){

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list.get(i).equals(ele)){
                a.add(list.get(i));
            }
        }

        for(int i=0;i<a.size();i++){
            if(!a.get(i).equals(a.get(a.size()-1-i))){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws IOException{
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        ArrayList<String> ans = new ArrayList<>();

        for(int m=0;m<t;m++){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=0;i<n;i++) list.add(Integer.parseInt(st.nextToken()));
            
            boolean found = true;
            for(int i=0;i<n;i++){
                if(!list.get(i).equals(list.get(list.size()-1-i))){
                    found = false;

                    if(isPalindrome(list,list.get(i)) || isPalindrome(list,list.get(n-i-1))){
                        ans.add("YES"); 
                    }
                    else{
                        ans.add("NO");    
                    }
                    break;
                }
            }
            if(found) ans.add("YES");

        }

        for(int i=0;i<t;i++) System.out.println(ans.get(i));

    }    
}
