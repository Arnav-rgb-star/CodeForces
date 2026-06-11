
import java.util.*;
public class Basketball {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        ArrayList<Integer> stack = new ArrayList<>();
        int count=0;
        while(start < end){
            if(arr[end] > target){
                --end;
                ++count;
            }
            else{
                stack.add(arr[start]);
                if(arr[end]*(stack.size()+1) > target){
                    ++start;
                    --end;
                    ++count;
                    stack.clear();
                }
                else{
                    ++start;
                }
            }
        }
        if(target < arr[0]){
            ++count;
        }
        System.out.println(count);
    }
}
