import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int m = sc.nextInt();
	    for(int i=l+1;i<m;i++){
	        if(i%2==0){
	            System.out.print(i+" ");
	        }
	    }
	}
}
