import java.util.*;
public class Max_diff{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);  
        int n=scan.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
            a[i] = scan.nextInt();
        Arrays.sort(a);
        System.out.println(a[a.length-1] - a[0]);
     }
}
