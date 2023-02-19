public class Variants {

    public static void main(String[] args) {
        variants(0);
    }

    public static void variants(double n) {
        if (n % 2 == 0) System.out.println("Число четное");
        if (n % 10 == 0) System.out.println(n / 10);
        if (n % 3 == 0) System.out.println(Factorial.calculateFactorial(n));
    }
}