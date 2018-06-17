import java.util.*;
class Primenum{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    boolean flag = true;
	    for(int i=2;i<=l/2;i++){
	        if(l%i==0){
	            flag = false;
	            break;
	        }
	    }
	    if(flag){
		    System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }
	}
}
