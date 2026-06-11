
import java.util.*;
public class prinzee {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    ArrayList<StringBuilder> list = new ArrayList<>();


    for(int m=0;m<t;m++){
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        int len=0;

        while(!found){

            if(len==0){
                for(int i=0;i<26;i++){

                sb.setLength(0);
                sb.append((char)('a'+i));
                if(!s.contains(sb)){
                    found=true;
                    break;
                }
                }
            }
                else if(len==1){
                    for(int i=0;i<26;i++){
                        for(int j=0;j<26;j++){
                            sb.setLength(0);
                            sb.append((char)('a'+i));
                            sb.append((char)('a'+j));

                            if(!s.contains(sb)){
                                found=true;
                                break;
                            }
                        }
                        if(found) break;
                    }
                }
                else if(len==2){
                    for(int i=0;i<26;i++){
                        for(int j=0;j<26;j++){
                            for(int k=0;k<26;k++){
                                sb.setLength(0);
                                sb.append((char)('a'+i));
                                sb.append((char)('a'+j));
                                sb.append((char)('a'+k));
                            
                                if(!s.contains(sb)){
                                    found=true;
                                    break;
                                }
                            }
                            if(found) break;
                        }
                        if(found) break;
                    }
                }
                ++len;
        }

        if(found) list.add(sb);
    }
    for(int i=0;i<t;i++) System.out.println(list.get(i));
  }  
}
