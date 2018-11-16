import java.util.*;
public class power
{
     public static void main(String []args)
	 {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int result=1;
        for(int i=0;i<m;i++)
            result *=n;
        System.out.println(result);
     }
}
