public class l5q3 {
    
    public static int findGCD(int n1, int n2)
    {
        if (n2 != 0)
            return findGCD(n2, n1 % n2);
        else
            return n1;
    }
    public static void main(String[] args) {
        int gcd1 = findGCD(2, 0);
        int gcd2 = findGCD(-1, -1);
        int gcd3 = findGCD(40, 60);
        int gcd4 = findGCD(-3, -1);

        System.out.printf("GCDs are %d %d %d %d.", gcd1, gcd2, gcd3, gcd4);
    }

   
}
