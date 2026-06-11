import java.util.*;
public class OlyaAndArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        LinkedList<Long> list = new LinkedList<>();

        for(int k=0;k<t;k++){
            int n=in.nextInt();
            List<Integer> second = new ArrayList<>();
            long sum=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int m=in.nextInt();
                int []a = new int[m];

                for(int j=0;j<m;j++) a[j]=in.nextInt();

                Arrays.sort(a);
                sum+= a[1];
                second.add(a[1]);
                min= Math.min(a[0],min);
            }
            Collections.sort(second);
            list.add(sum + min - second.get(0));
        }

        for(int k=0;k<t;k++){
            System.out.println(list.get(k));   
        }
    }
}
