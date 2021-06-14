public class Discount {
    double purchase;
    double total;
    double discount;

    Discount(Double purchase){
        this.purchase = purchase;
    }

    double calc(double purchase){
       if(purchase <= 5000){
          discount = 0;
       }else if(purchase > 5000 && purchase<=10000){
           discount = 0.1*(purchase - 5000);
       }else if(purchase > 10000 && purchase <= 20000){
           discount = 0.2*(purchase - 10000);
       }else if(purchase>20000&&purchase<=30000){
           discount = 0.3*(purchase-20000);
       }else if(purchase>30000){
           discount = (0.5*(purchase-30000))+(0.02*purchase);
       }
       total = purchase - discount;
       return discount;
    }

    void display(){
       System.out.println("Purchase amount: "+purchase+"\n");
       System.out.println("Total payment made: "+total+"\n");
    }

    public static void main(String args[]) {
        Discount D1 = new Discount(20221.0);
       double x = D1.calc(20221.0);
       D1.display();
    }
}
