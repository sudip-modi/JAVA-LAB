import java.util.Scanner;
public class NumberProb {
    
    int sumOfFactors(int n){
        int sum = 0;
        for(int i = 1; i<n;i++){
            if(n%i==0){
                sum += i;
            } 
        }
        return sum;
    }
    boolean isPerfect(int num){
        if(num==sumOfFactors(num)){
           return true;
        }
        return false;
    }
    public static void main(String args[]){
        NumberProb N1 = new NumberProb();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a number");
         int input = sc.nextInt();
        System.out.println("sum of factors of "+input+ " is: "+N1.sumOfFactors(input));
        if(N1.isPerfect(input)==true){
            System.out.println(input + " is a perfect number");
        }else{
            System.out.println(input + " is not a perfect number");
        }   }   }
