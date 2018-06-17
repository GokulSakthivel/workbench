import java.util.*;
class Armstrongnum{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int temp=0;
	    int sum=0;
	    int n=l;
	    while(n!=0){
	        temp = n%10;
	        sum = sum + (temp*temp*temp);
	        n = n/10;
	    }
	    if(sum==l){
	        System.out.print("yes");
	    }
	    else{
	        System.out.println("no");
	    }
	}
}
