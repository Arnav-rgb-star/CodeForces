import java.util.*;
 
public class C_Raspberries{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int t = input.nextInt();
	int []b = new int[t];
	
	for(int i=0 ; i<t ; i++){
	    
	    int n , k , max=-1, r=0 ;
	    n = input.nextInt();
	    k = input.nextInt();
	    
	    int []a = new int[n];
        int m=1;
	    
	    for(int j=0 ; j<n ; j++){
	    a[j] = input.nextInt();
        m = m * a[j];
	    }
	    
	    for(int j=0 ; j<n ; j++){
	    r =  (a[j] % k) ;
	    
        if(m % k == 0 && k==4){
            max = 0;
            break;
        }
 
	    if(max  < r) {
	    max = r;
	    }
	    if( r== 0 ){
	        max=0;
	        break;
	    }
	        }
	    b[i] = (k - max) % k;
        
 
		if(k==4 && max!=0 && max!=3){
			--b[i];
		}
	    }
	for(int i : b)
	System.out.println(i);
 
	}
}