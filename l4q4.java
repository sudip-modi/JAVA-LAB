class l4q4{
    public static void main(String args[]){
        Area a = new Area();
        System.out.println(a.RectangleArea(2, 4));
        System.out.println(a.SquareArea(5));
        System.out.println(a.CircleArea(4));
    }
}
abstract class Shape{
    abstract int RectangleArea(int l, int b);
    abstract int SquareArea(int s);
    abstract double CircleArea(int r);
}
class Area extends Shape{
    int RectangleArea(int l, int b){
        return l*b;
    }
    int SquareArea(int s){
        return s*s;
    }
    double CircleArea(int r){
        return 3.14*r*r;
    }  
}
