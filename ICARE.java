public class ICARE {
    public static void main(String[] args) {
        Hit obj1 = new ICARE().new Hit();
        obj1.cse();
        obj1.ece();
        obj1.ee();
        obj1.me();
    }
    class Hit{
        public void cse(){
            System.out.println("cse method");
        }
        public void ece(){
            System.out.println("ece method");
        }
        public void ee(){
            System.out.println("ee method");
        }
        public void me(){
            System.out.println("me method");
        }
    }
}
