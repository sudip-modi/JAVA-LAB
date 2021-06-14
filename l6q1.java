import java.util.Calendar;

class l6q1{
    public static void main(String args[]){
      Calendar current = Calendar.getInstance();

      System.out.println("Current Year: "+current.get(Calendar.YEAR));
      System.out.println("Current Month: "+(current.get(Calendar.MONTH)+1));

    }
}