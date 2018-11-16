import java.util.*;
public class Armstrong{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str[] = (n+"").split("");
        int a[] = new int[str.length];
        for(int i=0;i<str.length;i++)
            a[i] = Integer.parseInt(str[i]);
        int result=0;
        for(int i=0;i<str.length;i++)
            result +=(int)Math.pow(a[i],str.length);
        String s = (n==result)?"YES":"NO";
        System.out.println(s);
     }
}
