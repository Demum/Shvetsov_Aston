import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HashMapTest {
    static String words = " Упади семь раз и восемь раз и и поднимись";
    static Map<String, String> map = new HashMap<>();
    static Map<Integer, String> map2 = new HashMap<>();
    static Map<String, Long> result = new HashMap<>();

    static int count;

    public static void main(String[] args) {
        wordsCount(words);
    }

    public static void wordsCount(String string) {

        for (String split : string.toLowerCase().trim().split(" ")) {
            map2.put(count += 1, split);
            map.put(split, split);
        }

        for (String s : map.keySet()) {
            long count = map2.entrySet().stream().filter(x -> x.getValue().matches(s)).count();
            result.put(s, count);
        }
        System.out.println(result);
    }
}