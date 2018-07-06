import java.util.*;
import java.lang.*;
public class Guvi_4{
     public static void main(String aa[]){
     int n;
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();

     }
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if((a[i]+a[j])==0){
                System.out.printf("%d %d \n",a[i],a[j]);
            }
        }
    }

    }

}
