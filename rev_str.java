import java.util.*;
import java.io.*;
class rev_str
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.nextLine().split(" ");
        for(int i=str.length-1;i>=0;i--)
        System.out.println(str[i]);
        for(int i=str.length-1;i>=0;i--)
        {
            char ch[] = str[i].toCharArray();
            char[] c = new char[ch.length];
            int p=0;
            int l=c.length-1;
            for(int k=p;k<c.length;k++)
            {
                for(int j=l;j>=0;j--)
                {
                    c[k]=ch[j];
                    System.out.print(c[k]);
                    break;
                }
                p=p+1;
                l=l-1;
            }System.out.print(" ");
        }
    }
}
