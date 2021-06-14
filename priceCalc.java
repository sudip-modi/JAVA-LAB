import java.util.Scanner;

class priceCalc
{
         public static void main(String args[])
         {
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the printed price");
              Double price = sc.nextDouble();
              Double discountedPrice = (price - 0.1*price);
              Double finalPrice = (1.06*discountedPrice);
              System.out.println("Your final price is: " + finalPrice);
              
         }
}