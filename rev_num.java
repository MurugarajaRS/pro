import java.util.*;
class rev_num
{
    public static void main(String sr[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.next().split("");
        int c[] = new int[str.length];
        for(int i=0;i<str.length;i++)
            c[i] = Integer.parseInt(str[i]);
        for(int i=str.length-1;i>=0;i--)
            System.out.print(c[i]);
    }
}
