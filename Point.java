import java.util.Scanner;
import java.lang.Math;

public class Point {
    double x;
    double y;

    public static Double distance(Point p1, Point p2){
       Double distance = Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2));
       return distance;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = sc.nextInt();
        p1.y = sc.nextInt();
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();
        
        System.out.println("distance is: \n")
        System.out.println(distance(p1,p2));
    }
}
