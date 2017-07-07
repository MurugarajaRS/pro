import java.util.*;
import java.io.*;
class first_rep
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
            a[i]= scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            if(a[i] == a[j])
            {
                System.out.println("The number "+a[i]+" is first elment repeated in the array");System.exit(0);
            }
        }
    }
}
