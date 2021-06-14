import java.util.Scanner;
public class Menu {

    int sumOfPrime=0;
    int m=0; 
    boolean control;
    
    boolean checkPrime(int num) {
        int i = 2;
        boolean flag = false;
        while (i <= num / 2) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = true;
            break;
          }
    
          ++i;
        }
        if (!flag){
          return true;
        }else{
        return false;
            }
      }

    void sumOfPrime(){
        for(int i = 2; i < 100;i++){
            boolean x = checkPrime(i);
            if(x==true){
               sumOfPrime += i;
            }
        }
        System.out.println(sumOfPrime);       
    }

    static boolean checkAutomorphic(int n){
        int square = n*n;
            while(n>0){
               if(n%10!=square%10){
                   return false;
               }
               n=n/10;
               square=square/10;
            }
            return true;
    }
    public static void main(String args[]){
       Menu M1 = new Menu();
       System.out.println("Type 1 for knowing the sum of all prime numbers between 1 and 100");
       System.out.println("Type 2 for checking if a number is automorphic or not");
       Scanner sc = new Scanner(System.in);
       int choiceNumber = sc.nextInt();
       if(choiceNumber==1){
        M1.sumOfPrime(); 
       }else if(choiceNumber==2){
        System.out.println("Enter the number to be checked for automorphism");
        int number = sc.nextInt();
        System.out.println(checkAutomorphic(number)?"Automorphic":"Not automorphic");
       }
    }
}
