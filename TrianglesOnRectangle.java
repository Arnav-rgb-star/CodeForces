
 
import java.util.*;
public class TrianglesOnRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        LinkedList<Long> list = new LinkedList<>();

        for(int m=0;m<t;m++){
            long w=in.nextLong();
            long h=in.nextLong();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            ArrayList<Integer> d = new ArrayList<>();
            int n=in.nextInt();
            for(int i=0;i<n;i++){
                a.add(in.nextInt());
            }
            n=in.nextInt();
            for(int i=0;i<n;i++){
                b.add(in.nextInt());
            }
            n=in.nextInt();
            for(int i=0;i<n;i++){
                c.add(in.nextInt());
            }
            n=in.nextInt();
            for(int i=0;i<n;i++){
                d.add(in.nextInt());
            }

            int[] max = new int[4];
            max[0]=a.get(a.size()-1)-a.get(0);
            max[1]=b.get(b.size()-1)-b.get(0);
            max[2]=c.get(c.size()-1)-c.get(0);
            max[3]=d.get(d.size()-1)-d.get(0);
            long Area1=(long)Math.max(max[0],max[1])*(h);
            long Area2=(long)Math.max(max[2],max[3])*(w);
            long MAX = Math.max(Area1,Area2);
            list.add(MAX);

        }
        
        for(int m=0;m<t;m++){
            System.out.println(list.get(m));
        }
    }
}
