import java.util.*;
public class Combination{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);  
        int n=scan.nextInt();
        int m = scan.nextInt();
        int a = 1;
        int p=n;
        for(int i=0;i<m;i++)
        {
            a*=p;
            p--;
        }
        for(int i=1;i<=m;i++)
            a/=i;
        System.out.println(a);
     }
}
