
import java.util.*;

public class SD
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i<t ; i++){
		
		String str = input.nextLine();
		int zeros = 0;
		int ones = 0;
		int con = 0;
		
		if(str.length() == 0){
		    list.add(0);
		}
		
		for(int j=0 ; j<str.length() ; j++){
		    if(str.charAt(j) == '0')
		    {
		        ++zeros;
		    }
		    else{
		        ++ones;
		    }
		}
        for(int j=0 ; j<str.length() ; j++){

            if(str.charAt(j) ==  '1' && zeros > 0 ){
            --zeros;
            ++con;
            }
            else if(str.charAt(j) ==  '0' && ones > 0 ){
            --ones;
            ++con;
            }
            else{
                break;
            }
        }
            list.add(str.length() - con);
		}

		for(int i=0 ; i<t ; i++){
		    System.out.println(list.get(i));
		}
	}
}