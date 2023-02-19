import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    static String str = "Никогда не ошибается тот, кто ничего не делает";

    public static String reverse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        Collections.reverse(list);
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c : list) {
            builder.append(c);
        }
        return builder.toString();
    }

    public static String reverse2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }
}