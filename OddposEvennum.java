import java.util.*;
class OddposEvennum{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if((a[i]%2==0)&&(i%2==1)){
                System.out.println(a[i]+" ");
            }
            if((a[i]%2==1)&&(i%2==0)){
                System.out.println(a[i]+" ");
            }
        }
    }
}
