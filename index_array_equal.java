import java.util.*;
import java.io.*;
class index_array_equal
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
            if(a[i] == i)
            {
                System.out.print("The number "+a[i]+" is equals its index to "+i);
            }
        }
    }
}
