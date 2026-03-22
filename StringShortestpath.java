import java.util.*;
public class StringShortestpath {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1;
    System.out.println("enter direction");
    s1=sc.next();
    System.out.println("shortest distant is "+ distant(s1));
        
    }
    public static double distant(String s1)
    {
        int length=0;
        int height=0;
        for(int i=0;i<s1.length();i++)
        {
           if(s1.charAt(i)=='N')
           {
             length=length+1;
           }
           else if(s1.charAt(i)=='S')
           {
            length=length-1;
           }
           else if(s1.charAt(i)=='E')
           {
             height=height+1;
           }
           else if(s1.charAt(i)=='W')
           {
            height=height-1;
           }

        }
        double Path=(height*height)+(length*length);
        Path=Math.sqrt(Path);
        return Path;

    }
}
