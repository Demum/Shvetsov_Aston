import java.util.Arrays;

public class StringBuilding {
    static String baseString = "Работать нужно не 12 часов, а головой!";

    public static String deleteExclamationMark() {
        return baseString.replace("!", "");
    }

    public static String multiplyString3Times() {
        String multiplyString = "";
        for (int i = 0; i < 3; i++) {
            multiplyString += " " + baseString;
        }
        multiplyString = multiplyString.trim();
       return multiplyString;
    }
    public static String changeChar(String s) {
        return s.replace("*", "a");
    }

    public static void countChar(){
       String[] arrays= baseString.split("");
      long i=  Arrays.stream(arrays).filter(x-> x.equalsIgnoreCase("в")).count();
        System.out.println(i);
    }


}
