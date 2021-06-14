import java.lang.Math;
public class Series {
    double x;
    int n;
    double sumofSeries;
    Series(double x, int n){
      this.x = x;
      this.n = n;
    }
    long fact(int f){
        long factorial = 1;
        for(int i=1;i<=f;i++){
            factorial *= i; 
        }
        return factorial;
    }
    void sumSeries1(int x, int n){
        for(int i = 1; i <= n; i++){
           sumofSeries += x/fact(i);
        }
        System.out.println("sum of the series is: "+sumofSeries);   
    }
    void sumSeries2(int x, int n){
        for(int i = 1; i <= n; i++){
           sumofSeries += (Math.pow(x,i))/fact(i+1);
        }
        System.out.println("sum of the series is: "+sumofSeries);   
    }
    void sumSeries3(int x, int n){
        for(int i = 1; i <= n; i++){
           sumofSeries += (Math.pow(x,i)*Math.pow(-1,i+1))/fact(i+1);
        }
        System.out.println("sum of the series is: "+sumofSeries);   
    }
    public static void main(String args[]){
        Series s = new Series(2,20);
        s.sumSeries1(2,20);
    }
}
