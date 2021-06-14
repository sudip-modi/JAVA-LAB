import java.util.Scanner;
public class l2q2 {
    int b = 0,sum = 0,primeSum = 0;
    boolean cbool;
    boolean isPrime(int n){
       if(n==0||n==1){
           cbool=false;
       }else{
           for(int i=2;i<=n;i++){
               if(n%i==0){
                b = 1;
                cbool=false;
               }
           } 
           if(b==0){
            cbool=true;
           }
       }
       return cbool; 
    }
    int sumOfPrimeDigits(int n){

        int remainder,quotient,sum=0;

        while(n>0){
          remainder = n%10;
          if(isPrime(remainder)==true){
            sum+=remainder;
          }
          quotient = n/10;
          n = quotient;
       }

       return sum;
    }

    void check(int[] integers){
        for(int i = 0; i < integers.length; i++){
          if(isPrime(integers[i])==true){
             primeSum+=integers[i];
          }
        }
        System.out.println(isPrime(primeSum)?"sum of prime numbers of the array is a prime number":"sum of prime numbers of the array is not a prime number");
    }
    public static void main(String args[]){
      
        l2q2 l = new l2q2();
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter 10 numbers space separated ");
        String input = sc.nextLine();
        String[] numbersString = input.split(" ");
        int[] numbers = new int[numbersString.length];
        l.check(numbers);

    }
}
