import java.util.Scanner;

class LAB1Q5
{
         public static void main(String args[])
         {
              
              int totalShares = 3000;   
              
              int nominalValue = 10;
              
              int dividendPercentage = 10;

              int annualDividend = 2000;

              int currentNoOfShares = (annualDividend*100)/(nominalValue*dividendPercentage);

              int requiredShares = 3000 - currentNoOfShares;

              System.out.println("required no of shares: " + requiredShares);

         }
}