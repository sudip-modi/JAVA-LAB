import java.util.Scanner;

public class l5q5 {
    int x,y;
    static void swapnumbers(l5q5 obj){
      int temp = obj.x;
      obj.x=obj.y;
      obj.y=temp;
      System.out.printf("%d %d",x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l5q5 obj = new l5q5();
        obj.x = sc.nextInt();
        obj.y = sc.nextInt();
        o bj.swapnumbers(obj);
        
    }
}
