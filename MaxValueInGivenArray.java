import java.util.*;
import java.lang.*;
class MaxValueInGivenArray{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int flag=0;
		for(int i=0;i<n;i++){
		    array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=n-1;i>=0;i--){
		    flag = flag*10+array[i];
		}
		System.out.println(flag);
	}
}
