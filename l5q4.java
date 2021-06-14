public class l5q4 {

    static int sum(int n1, int n2){
      return n1+n2;
    }

    int multiply(int n1, int n2){
      return n1*n2;
    }
 
    public static void main(String[] args) {
        l5q4 obj = new l5q4();
        System.out.println(sum(1,2));
        System.out.println(obj.multiply(1,2));
        System.out.println(sum(3,5));
        System.out.println(obj.multiply(3,5));
    }
}
