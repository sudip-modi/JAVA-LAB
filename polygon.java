public class polygon{
    void polygon(int n, char ch){
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
               System.out.print(ch+" ");
           }
           System.out.print(System.lineSeparator());
       }
    }
    void polygon(int x, int y){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("@ ");
            }
            System.out.print(System.lineSeparator());
        }
    }
    void polygon(){
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
    }
    public static void main(String args[]){
        polygon p = new polygon();
        p.polygon();
        p.polygon(10, 'a');
        p.polygon(10, 15);
    }
}