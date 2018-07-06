import java.util.*;
import java.lang.*;
public class Array_Subset{
     public static void main(String aa[]){
     int n;
     Scanner s=new Scanner(System.in);
     int count=0;
     n=s.nextInt();
     int n1=s.nextInt();
     int a[]=new int[n];
     int a1[]=new int[n1];
     for(int i=0;i<n;i++){
         a[i]=s.nextInt();

     }
     for(int i=0;i<n1;i++){
         a1[i]=s.nextInt();

     }
    for(int i=0;i<n;i++){
        for(int j=0;j<n1;j++){
            if((a[i]==a1[j])){
                count++;
                break;
            }
        }
    }
if(count==n1){
    System.out.print("Yes");
}
else{
    System.out.print("No");
}
    }

}
