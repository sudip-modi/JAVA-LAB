abstract public class Bank {
    public abstract void getBalance();  
    public static void main(String args[]){
        BankA b1 = new BankA();
        b1.getBalance();
        BankB b2 = new BankB();
        b2.getBalance();
        BankC b3 = new BankC();
        b3.getBalance();
    }
}
class BankA extends Bank{
  public void getBalance(){
      System.out.println("100");
  }
}
class BankB extends Bank{
    public void getBalance(){
        System.out.println("200");
    }  
}
class BankC extends Bank{
    public void getBalance(){
        System.out.println("300");
    } 
}