public class Test {
    public static void main(String[] args) {

        int arr[] = new int[]{3, 4, 7};
        int arr2[];
        for (int i = 0; i < arr.length; i++) {
            arr2 = new int[]{arr[arr.length - i - 1]};
            System.out.println("--");
            for (int arrr : arr2) {
                System.out.println(arrr);
            }

        }
    }
}
