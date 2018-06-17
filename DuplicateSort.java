import java.util.*;
class DuplicateSort{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int flag=0;
		for(int i=0;i<n;i++){
		    array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<n-1;i++){
		    for(int j=i+1;j<n;j++){
		        if(array[i]==array[j]){
		            System.out.print(array[i]+" ");
		            for(int k=j;k<n-1;k++){
		                array[k]=array[k+1];
		            }
		            n--;
		            j--;
		            break;
		        }
		    }
		}
	}
}
