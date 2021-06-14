import java.util.Scanner;

public class PhoneBill {
    
    String name; //name of customer
    int cno; //customer number
    int un; //number of units consumed
    double bill;


    void input(){
       System.out.println("enter name");
       Scanner sc = new Scanner(System.in);
       name = sc.nextLine();
       System.out.println("enter customer number");
       cno = sc.nextInt();
       System.out.println("enter units consumed");
       un = sc.nextInt();
    }

    void compute(){
      if(un<=50){
         bill = 250;
      }else if(un>50&&un<=250){
          bill = 250+(1.20*(un-50));
      }else if(un>250&&un<=400){
          bill = 250+240+(1.10*(un-250));
      }else if(un>400){
          bill = 250+240+165+(1*(un-400));
      }
    }

    void display(){
      System.out.println(cno+"  "+name+"  "+bill);
    }


    public static void main(String[] args) {
        PhoneBill p = new PhoneBill();
        p.input();
        p.compute();
        p.display();
    }
    
}
