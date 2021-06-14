public class Busfare {
    String num;
    String name;
    int km; //stores kilometeres travelled
    double fare;


    Busfare(String num,String name,int km){
      this.num = num;
      this.name = name;
      this.km = km;

    }

    double calcFare(int km){
    
           if(km<=10){
               fare = (double)(5*km);
           }else if(km>10&&km<=20){
                fare = (double)(50+(km-10)*10);
           }else if(km>20&&km<=30){
               fare = (double)(150+(km-20)*15);
           }else if(km>30&&km<=40){
               fare = (double)(300+(km-30)*20);
           }else if(km>40){
               fare = (double)(500+(km-30)*25);
           }
           return fare;
    }

    public void show(){
        System.out.println("Bus No   "+"Name   "+"Kms travelled   "+"Fare");
        System.out.println(num+" "+name+" "+km+" "+fare);
    }

    public static void main(String args[]){
       Busfare bus1 = new Busfare("123","sudip",20);
       double x = bus1.calcFare(20);
       bus1.show();
    }
}


