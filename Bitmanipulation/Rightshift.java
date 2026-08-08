package Bitmanipulation;
import java.util.*;
public class Rightshift {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n[]=bits(num);
        System.out.println("bit0: " + n[0] + "\nbit1: " + n[1] );

  }
  public static int[] bits(int num){
            int bit1=0;
            int bit0=0;
            int bit;
            while(num>0)
            {
                bit=num&1;
                if(bit==1)
                {
                    bit1++;
                }
                else{
                    bit0++;
                }
                num=num>>=1;
                
            }

return new int[]{bit0, bit1};
        }
}