import java.lang.Math;
import java.util.Scanner;

public class Test{

    double sum;
    void fibonacci(){
        int n1=0,n2=1,n3=2,n4,i,count=8;    
        System.out.print(n1+" "+n2);
        for(i=2;i<count;++i)
          {    
           n4=n1+n2+n3;    
           System.out.print(" "+n3);    
           n1=n2;    
           n2=n3; 
           n3=n4;   
          }    
}

double factorial(int n){
    double factorial = 1;
    for(int i=1;i<=n;i++){
        factorial *= i; 
    }
    return factorial;
}
    void sum(int x){
        
        for(int i = 1; i < 6; i++){
            sum += (Math.pow(-1,i+1))*(Math.pow(x,i)/factorial(i));
        }

        System.out.println("\n"+sum);
    }
    

    public static void main(String args[]){
        
       Test t = new Test();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 1 for fibonacci or 2 for sum of series");
       int n = sc.nextInt();

       if(n==1){
        t.fibonacci();
       }else if(n==2){
        t.sum(9);
       }
    }
}