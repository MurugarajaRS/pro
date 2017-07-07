import java.util.*;
import java.io.*;
class duplicate
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
                System.out.println("The number "+a[i]+" is duplicate in this array");break;
            }
        }
    }
}
