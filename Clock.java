import java.util.*;
public class Clock{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        float n = scan.nextFloat();
        float h = n/60;
        String str = h+"";
        String s = str.substring(2);
        if(s.length()!=2)
            str+=0+"";
        if(str.length()!=5)
            str=0+""+str;
        String m = Float.parseFloat(str.substring(0,2))+(Float.parseFloat(str.substring(2))*60)/100 +"";
        s = m.substring(2);
        if(s.length()!=2)
            m=m+"0";
        m=m.replace("."," ");
        System.out.println(m);
     }
}
