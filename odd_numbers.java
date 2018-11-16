import java.util.*;
public class odd_numbers{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String str = "";
        for(int i=n+1;i<m;i++)
            if(i%2!=0)
                str +=i+" ";
        str=str.trim();
        System.out.println(str);
     }
}
