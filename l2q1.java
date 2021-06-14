import java.util.*;

public class l2q1 {
    int sumOfDigits(int n){
       int remainder,quotient,sum=0;

        while(n>0){
          remainder = n%10;
          sum+=remainder;
          quotient = n/10;
          n = quotient;
       }

       return sum;
    }

    boolean magic(int n){
       while(n>9){
           n = sumOfDigits(n);
       }
       if(n==1){
           return true;
       }else{
           return false;
       }
    }
    public static void main(String args[]){
      l2q1 l = new l2q1();
      System.out.println("enter a number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean b = l.magic(n);
      if(b==true){
          System.out.println("it is a magic number");
      }else{
          System.out.println("not a magic number");
      }

    }
}
