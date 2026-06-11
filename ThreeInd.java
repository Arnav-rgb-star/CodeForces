import java.util.*;
public class ThreeInd {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t-- >0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int a=-1,b=-1,c=-1;

            for(int i=0 ; i<n ; i++){
                arr[i] = in.nextInt();
            }
            boolean found = false;
            for(int i = 1 ; i<arr.length-1 ; i++){
                if((arr[i] > arr[i-1]) && (arr[i] > arr[i+1])){
                    found = true;
                    a = i;
                    b = i+1;
                    c = i+2;
                    break;
                }
            }
            if(found){
                System.out.println("YES");
                System.out.printf("%d %d %d\n",a,b,c);
            }
            else{
                System.out.println("NO");
            }
    }
    }
}
