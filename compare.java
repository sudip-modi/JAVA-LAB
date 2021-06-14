public class compare {
    void compare(int x, int y){
        if(x>y){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
    void compare(char x, char y){
        if(Character.getNumericValue(x)>Character.getNumericValue(y)){
            System.out.print(x);
        }else{
            System.out.print(y);
        }
    }
    void compare(String x, String y){
        if(x.length()>y.length()){
            System.out.print(x);
        }else{
            System.out.print(y);
        }
    }
    public static void main(String args[]){
      compare c = new compare();
      c.compare(10, 4);
      System.out.println("\n");
      c.compare('g', 'x');
      System.out.println("\n");
      c.compare("hello world", "new singer, new dancer");
    }
}
