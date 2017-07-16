import java.util.*;
class str_to_int
{
    public static void main(String sr[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.next().split("");
        int c[] = new int[str.length];
        System.out.print("string to integer: ");
        for(int i=0;i<str.length;i++)
        {
            c[i] = Integer.parseInt(str[i]);
            System.out.print(c[i]+" ");
        }
    }
}
