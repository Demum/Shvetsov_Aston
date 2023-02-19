import java.util.Arrays;

public class Anagram {
    static String s = "обезьянство";
    static String s1 = "светобоязнь";

    public static void main(String[] args) {
        System.out.println(isAnagram(s, s1));
    }

    public static String sort(String s) {
        char[] someString = s.toCharArray();
        Arrays.sort(someString);
        return new String(someString);
    }

    public static boolean isAnagram(String s, String s1) {
        if (s.length() != s1.length()) {
            return false;
        }
        return sort(s).equals(sort(s1));
    }
}