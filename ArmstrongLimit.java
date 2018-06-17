import java.util.*;
class ArmstrongLimit{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int m = sc.nextInt();
	    int temp=0;
	    int sum=0;
	    int n=0;
	    for(int i=l;i<=m;i++){
	        n=i;
	    while(n!=0){
	        temp = n%10;
	        sum = sum + (temp*temp*temp);
	        n = n/10;
	    }
	    if(sum==i){
	        System.out.print(i+" ");
	    }
	    sum=0;
	    }
	}
}
