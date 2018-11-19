import java.util.*;
public class Array_sort{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);  
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m+n];
        for(int i=0;i<m;i++)
            a[i] = scan.nextInt();
        for(int i=0;i<n;i++)
            b[i] = scan.nextInt();
        for(int i=0;i<m;i++)
            c[i] = a[i];
        int p=0;
        for(int i=m;i<c.length;i++)
            for(int j=p;j<n;j++)
            {
                c[i] = b[j];
                p++;
                break;
            }
        Arrays.sort(c);
        String s = "";
        for(int i=0;i<c.length;i++)
            s+= c[i]+" ";
        s=s.trim();
        System.out.println(s);
     }
}
