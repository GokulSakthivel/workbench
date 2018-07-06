import java.util.*;
class duplicate_num{
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    res=a[i];
                    break;
                }
            }
            if(res>0) break;
        }
        System.out.println(res);
    }
}
