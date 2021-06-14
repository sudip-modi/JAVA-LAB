import java.lang.Math;
import java.util.*;

public class CA1Q2 {
   
    int sum1;
    double sum2;

    void series1(int n){
       for(int i = 1; i <= n; i++){
           sum1 += ((i*i*i)-1);
       }
       System.out.println("\n"+"sum of the series is: "+sum1);
    }

    double factorial(double n){
        double factorial = 1;
        for(int i=1;i<=n;i++){
            factorial *= i; 
        }
        return factorial;
    }

    void series2(double x, int n){
       for(int i = 1; i <= n ; i++){
           sum2 += (factorial(x+(Math.pow(2,i-1)))/5*(i+1));
       }

       System.out.println("sum of the series is: "+sum2);
    }
    
    public static void main(String args[]){
        CA1Q2 t = new CA1Q2();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for sum of series 0,7,26,63... upto n terms");
        System.out.println("enter 2 for sum of series x!/10+(x+2)!/15+(x+4)!/20... upto n terms");

        int c = sc.nextInt();

        if(c==1){
          System.out.println("enter the number of items in the series");
          int items = sc.nextInt();

          t.series1(items);

        }else if(c==2){
          
            System.out.println("enter the number x");
            double x = sc.nextDouble();

            System.out.println("enter the number of terms n in the series");
            int n = sc.nextInt();

            t.series2(x,n);
        }

    }
}
