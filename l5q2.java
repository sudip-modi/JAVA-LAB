    interface number{
        int findSqr(int n);
    }
    class A implements number{
        public int findSqr(int n){
          return n*n;
        }
    } 
    class l5q2{
        public static void main(String[] args){
            A obj = new A();
            System.out.println( obj.findSqr(-3));
            System.out.println( obj.findSqr(10));
        
        }
    }
    

