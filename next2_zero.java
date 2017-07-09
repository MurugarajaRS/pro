import java.util.*;
import java.io.*;
class next2_zero
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]= scan.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                System.out.println("The numbers are "+a[i]+" "+a[i+1]);
                break;
                
            }
        }
        
    }
}
