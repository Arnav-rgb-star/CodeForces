
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Long> list = new LinkedList<>();
        in.nextLine();

        for(int m=0 ; m<t;  m++){
            int n = in.nextInt();
            char k = in.next().charAt(0);
            in.nextLine();
            String str = in.nextLine();
            long distance = 0;

            StringBuilder sb = new StringBuilder(str);
            for(int i=0 ; i<n ; i++){
                sb.append(str.charAt(i));
            }
            int index = -1;
            for(int i = sb.length()-1 ; i>=0 ; i--){
                char ch = sb.charAt(i);
                if(ch == 'g'){
                    index = i;
                }
                else if(ch == k){
                    distance = Math.max(distance,index - i);
                }
            }

            list.add(distance);
        }

        for(int m=0 ; m<t;  m++){
            System.out.println(list.get(m));
        }
    }
}
