public class Fibonachi {
    public static void main(String[] args) {
        calculateFibonachi();
    }

    public static void calculateFibonachi() {
        //0 1 1 2 3 5 8
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < 10; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}

