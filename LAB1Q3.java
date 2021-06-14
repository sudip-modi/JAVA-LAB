import java.util.Scanner;

class LAB1Q3
{
         public static void main(String args[])
         {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the printed price");
              Double price = sc.nextDouble();
              Double discount1 = 0.3*price;
              Double finalPrice1 = price - discount1;
              
              Double discount2 = 0.2*price;
              Double finalPrice2 = price - discount2;

              Double discount3 = 0.1*finalPrice2;
              Double finalPrice3 = finalPrice2 - discount3;
             
              System.out.println("30% discount = " + discount1);
              System.out.println("20% discount = " + discount2);
              System.out.println("10% discount = " + discount3);
              
         }
}