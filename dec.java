import java.util.*;
class dec
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str[] = scan.nextLine().split(" ");
    
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
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
