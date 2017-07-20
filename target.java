import java.util.*;
class st
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.nextLine().split(" ");
        int target = scan.nextInt();
        int a[]= new int[str.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<str.length;i++)
        {
            list.add(Integer.parseInt(str[i]));
        }
        for(int i=0;i<list.size();i++)
        {
            a[i]=list.get(i);
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]+a[j])==target)
                {
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
}
