import java.util.*;
import java.io.*;
class rev_string
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        String str[] = scan.nextLine().split(" ");
        for(int i=str.length-1;i>=0;i--)
            System.out.print(str[i]+" ");
    }
}
