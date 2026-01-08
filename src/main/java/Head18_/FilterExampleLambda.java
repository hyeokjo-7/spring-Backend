package Head18_;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleLambda {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(30);

        number.stream()
                .filter(num -> num % 15 == 0)
                .forEach(num -> System.out.println("이븐하지 않다" + num));
    }
}
