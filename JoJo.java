import java.util.*;
public class JoJo {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            in.nextLine();
            for(int k=0;k<t;k++){
                String str = in.nextLine();
                int count=0,maxCount=0;
                int i=0,idx=-1;
                int steps = 0;
                while(true) {
                    if(steps == 2*str.length()) {
                        break;
                    }
                    if(str.charAt(i)=='1') {
                        ++count;
                        if(count >str.length()) count = str.length();
                    }
                    else {
                        count=0;
                    }
                    maxCount=Math.max(maxCount,count);
                    i=(i+1)%(str.length());
                    ++steps;
                }
                if(maxCount==0){
                    list.add(0L);
                    continue;
                }
                if(maxCount==1){
                    list.add(1L);
                    continue;
                }
                long l=1,r=maxCount;
                long Area=0;
                if(maxCount==str.length()){
                    Area = 1L * maxCount * maxCount;
                }
                while(l<=maxCount && r>=1){
                    Area = Math.max(Area,l*r);
                    ++l;
                    --r;
                }
                list.add(Area);
            }
            for(int k=0;k<t;k++){
                System.out.println(list.get(k));
            }
        }
    }
