import java.util.List;


public class PhoneCount {
    public static void main(String[] args) {
        List<Phone> phone = List.of(new Phone( 54000),
                new Phone(45000),
                new Phone( 40000),
                new Phone( 32000));

        int sum = phone.stream().reduce(0,
                (x, y) -> {
                    if (y.getPrice() < 50000)
                        return x + y.getPrice();
                    else
                        return x + 0;
                },
                (x, y) -> x + y);

        System.out.println(sum); // 117000
    }
}