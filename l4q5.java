class l4q5 {
    public static void main(String[] args) {
        A obj1 = new A(27,78,59);
        System.out.println(obj1.getPercentage());
        B obj2 = new B(78, 23, 89, 99);
        System.out.println(obj2.getPercentage());
    }
}
abstract class Marks{
    abstract int getPercentage();
}
class B extends Marks{
    int a;
    int b;
    int c;
    int d;
    B(int a, int b, int c, int d){
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
    }
    int getPercentage(){
      int p = (a+b+c+d)/4;
      return p;
    }
}
class A extends Marks{
    int a;
    int b;
    int c;
    A(int a, int b, int c){
      this.a = a;
      this.b = b;
      this.c = c;
    }
    int getPercentage(){
      int p = (a+b+c)/3;
      return p;
    }
}
