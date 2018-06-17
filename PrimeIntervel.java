import java.util.*;
import java.math.*;
class PrimeIntervel{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int m = sc.nextInt();
	    boolean flag = true;
	    for(int i=l;i<=m;i++){
	        for(int j=2;j<i;j++){
	            if(i%j==0){
	                flag = false;
	                break;
	            }
	            else{
	                flag = true;
	            }
	        }
	        if(flag){
	            System.out.print(i+" ");
	        }
	    }
	}
}
