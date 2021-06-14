import java.util.Scanner;
import java.lang.Math;

class LAB1Q4
{
         public static void main(String args[])
         {
              
              Double sum = sc.nextDouble();   
              
              Double firstYearInterest = (5*1*sum)/100;

              Double sumAfterOneYear = sum + firstYearInterest;

              Double secondYearInterest = (5*1*sumAfterOneYear)/100;

              Double amountAfter3Years = sum*(Math.pow((1+0.05/1),(1*3)));

              System.out.println("first year interest is: " + firstYearInterest);

              System.out.println("second year interest: " + secondYearInterest);

              System.out.println("Total amount after 3 years: " + amountAfter3Years);
         }
}