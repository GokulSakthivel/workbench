import java.util.*;
class sum_inarray{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if((a[i]+a[j])==a[k]){
                        System.out.print(a[i]+" ");
                        System.out.print(a[j]+" ");
                        System.out.print(a[k]+" ");
                        System.out.println();
                        break;
                    }
                }
            }
        }
    }
}

