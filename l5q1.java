public class l5q1 {
    interface first{
        default void show(){
          System.out.println("interface 1");
        }
    }
    interface second{
        default void show(){
          System.out.println("interface 2");
        }
    }
    static class xyz implements first,second{
        public void show(){
            first.super.show();
            second.super.show();
        }
    }
    public static void main(String[] args) {
        xyz obj = new xyz();
        obj.show();
    } 
}
