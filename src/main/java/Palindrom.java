public class Palindrom {
    public static String s = "Аргентина манит негра";
    public static String s2;

    public static void main(String[] args) {
        System.out.println(isPalindrom(s));
    }
    public static boolean isPalindrom(String s){
        s = s.replace(" ","").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        s2= stringBuilder.reverse().toString();
        return s.equals(s2);
        }
    }

