import java.util.Scanner;
import java.lang.Math;

class Abc
{
         public static void main(String args[])
         {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter length");
              int l = sc.nextInt();
              System.out.println("enter gravitational acceleration");
              Double g = sc.nextDouble();
              System.out.println("Time is: "+(6.28*Math.sqrt(l/g)));
              
         }
}