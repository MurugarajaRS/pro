import java.util.*;
import java.lang.*;
class dup_Set
{
    public static void main(String sr[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.next().split("");
        HashSet<String> set = new HashSet<String>();
        for(int i=0;i<str.length;i++)
            set.add(str[i]);
            Iterator itr = set.iterator();
        while(itr.hasNext())
            System.out.print(itr.next());
    }
}
