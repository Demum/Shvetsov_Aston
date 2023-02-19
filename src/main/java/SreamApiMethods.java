import utils.JsonReaderUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class SreamApiMethods {

    private static List<Integer> numbers = Arrays.asList(1, 5, -3, 7, 8, 8);
    private static List<String> secondName = List.of("Швецов", "Арсеньев", "Дубоделов", "Горщарик", "Артемьев");

    public static void main(String[] args) {
        getPositiveNumbers(numbers);
        evenOddMethod(numbers);
        List<String> newList = chosenSecondNames(secondName);
        System.out.println(chosenSecondNames(secondName));
        getSumOddNumbers(numbers);
        System.out.println("" + checkIsPopular());
    }

    public static void getPositiveNumbers(List<Integer> list) {
        List<Integer> positiveNumbers = list.stream()
                .map(number -> {
                            if (number < 0)
                                return number * (-1);
                            else
                                return number;
                        }
                ).collect(Collectors.toList());
        System.out.println(positiveNumbers);
    }

    public static void getSumOddNumbers(List<Integer> list) {
        Optional<Integer> sum = list.stream()
                .filter(x -> (x % 2 == 0))
                .reduce(Integer::sum);
        System.out.println(sum.get());
    }

    public static void evenOddMethod(List<Integer> list) {
        List<Integer> evenOddNumbers = list.stream()
                .map(number -> {
                    if (number % 2 == 0)
                        return number * 100;
                    else
                        return number - 100;
                }).collect(Collectors.toList());
        System.out.println(evenOddNumbers);
    }

    public static List<String> chosenSecondNames(List<String> secondName) {
        return secondName.stream().filter(x -> x.charAt(0) == 'А').collect(Collectors.toList());
    }

    public static boolean checkIsPopular() {
        return JsonReaderUtils.getTest_data().entrySet()
                .stream()
                .filter(x -> (Objects.equals(x.getKey(), "isPopular")))
                .allMatch(x -> (!x.getValue()));
    }
}