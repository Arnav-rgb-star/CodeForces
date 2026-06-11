
import java.util.*;
public class Forked {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> list = new LinkedList<>();
        for(int j=0;j<t;j++){
            int a = in.nextInt();
            int b = in.nextInt();
            int xk = in.nextInt();
            int yk = in.nextInt();
            int xq = in.nextInt();
            int yq = in.nextInt();
            List<int[]> King = new ArrayList<>();
            King.add(new int[]{xk + a, yk + b});
            King.add(new int[]{xk + a, yk - b});
            King.add(new int[]{xk - a, yk + b});
            King.add(new int[]{xk - a, yk - b});
            King.add(new int[]{xk + b, yk + a});
            King.add(new int[]{xk + b, yk - a});
            King.add(new int[]{xk - b, yk + a});
            King.add(new int[]{xk - b, yk - a});

            List<int[]> Queen = new ArrayList<>();
            Queen.add(new int[]{xq+a, yq+b});
            Queen.add(new int[]{xq+a, yq-b});
            Queen.add(new int[]{xq-a, yq+b});
            Queen.add(new int[]{xq-a, yq-b});
            Queen.add(new int[]{xq+b, yq+a});
            Queen.add(new int[]{xq+b, yq-a});
            Queen.add(new int[]{xq-b, yq+a});
            Queen.add(new int[]{xq-b, yq-a});
            
            for (int i = 0; i < King.size(); i++) {
            for (int k = i + 1; k < King.size(); k++) {
                    if(King.get(i)[0] ==King.get(k)[0] && King.get(i)[1] == King.get(k)[1]) {
                        King.remove(k);
                        k--;
                    }
                }
            }
            for (int i = 0; i < Queen.size(); i++) {
            for (int k = i + 1; k < Queen.size(); k++) {
                    if(Queen.get(i)[0] ==Queen.get(k)[0] && Queen.get(i)[1] == Queen.get(k)[1]) {
                        Queen.remove(k);
                        k--;
                    }
                }
            }
            int count=0;
            for(int i=0;i<King.size();i++){
                for(int k=0;k<Queen.size();k++){
                    if((King.get(i)[0]==Queen.get(k)[0]) && (King.get(i)[1]==Queen.get(k)[1])){
                        ++count;
                    }
                }
            }
            list.add(count);
        }

        for(int j=0;j<t;j++){
            System.out.println(list.get(j));
        }
    }
}
