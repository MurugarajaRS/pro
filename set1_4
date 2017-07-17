import java.io.*;
import java.util.*;
class set1_4
{
    public static void main(String str[])
    {
        int a[] = new int[str.length];
        for(int i=0;i<str.length;i++)
            a[i] = Integer.parseInt(str[i]);
            Arrays.sort(a);
        for(int i=0;i<str.length;i++)
        {
            if(i<str.length-2)
            {
                if(a[i]!=a[i+1])
                {
                    System.out.print(a[i]);
                    break;
                }
                i++;
            }
            else
                System.out.print(a[str.length-1]);
        }
        
    }
}
