import java.util.*;
class Nsum{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
	    int n = sc.nextInt();
	    int[] array = new int[i];
	    int sum=0;
	    for(int j=0;j<i;j++){
	        array[j]=sc.nextInt();
	        if(n>0){
	            sum=sum+array[j];
	            n--;
	        }
	    }
		System.out.println(sum);
	}
}
