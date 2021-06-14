import java.lang.Math;
public class l2q3 {
    void compute(int num,char arg){
        int square,cube;
      if(arg=='s'){
        square = num*num;
        System.out.printf("square of the number is %d",square);
      }else{
          cube = num*num*num;
          System.out.printf("cube of the number is %d",cube);
      }
    }
    void compute(double side, char arg){
        double volume,diagonal;
        if(arg=='v'){
            volume=side*side*side;
            System.out.printf("volume of the cube is %f",volume);
        }else{
            diagonal=(Math.sqrt(3))*side;
            System.out.printf("diagonal length of the cube is %f",diagonal);
        } 
    }
    void compute(int l,int b,char arg){
         int area,perimeter;
         if(arg=='a'){
             area=l*b;
             System.out.printf("area of the rectangle is %d",area);
         }else{
             perimeter=2*(l+b);
             System.out.printf("perimeter of the rectangle is %d",perimeter);
         }
    }
    public static void main(String args[]){
        l2q3 l = new l2q3();
        l.compute(2,7,'v');

    }
    
}
