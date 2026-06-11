
RECURSIVE 

import java.util.*;
public class EraseFiorSe {

public static void del(String p, ArrayList<String> list, ArrayList<String> visited) {
    list.add(p);
    visited.add(p);

    for (int i = 0; i < list.size(); i++) {
        String current = list.get(i);

        if (current.isEmpty()) {
            continue;
        }

        // Generate next strings
        String s1 = current.substring(1);
        String s2 = current.length() != 1 ? current.charAt(0) + current.substring(2) : null;

        if (s1 != null && !visited.contains(s1)) {
            list.add(s1);
            visited.add(s1);
        }

        if (s2 != null && !visited.contains(s2)) {
            list.add(s2);
            visited.add(s2);
        }
    }
}

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int arr[] = new int[t];
        in.nextLine();

        for(int i=0 ; i<t ; i++){
        int n = in.nextInt();
        in.nextLine();
        String p = in.nextLine();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> visited = new ArrayList<>();
        del(p,list,visited);
        arr[i] = list.size();
        }
        for(int i=0; i<t ; i++){
            System.out.println(arr[i]);
        }
    }
} 
