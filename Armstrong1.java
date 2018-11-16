import java.util.*;
public class Armstrong1{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m=scan.nextInt();
        String s="";
        for(int j=n+1;j<m;j++)
        {
            String str[] = (j+"").split("");
            int a[] = new int[str.length];
            for(int i=0;i<str.length;i++)
                a[i] = Integer.parseInt(str[i]);
            int result=0;
            for(int i=0;i<str.length;i++)
                result +=(int)Math.pow(a[i],str.length);
            s += (j==result)?(j+" "):"";
        }
        System.out.println(s.trim());
     }
}
