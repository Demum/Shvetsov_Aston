public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));
    }

    public static int calculateFactorial(double n) {
        int result = 1;
        for (int i = result; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}