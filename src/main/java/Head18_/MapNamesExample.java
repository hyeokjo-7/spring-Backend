package Head18_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNamesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bod", "charlie");

        Function<String, Integer> nameLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        names.stream()
                .map(nameLength)
                .forEach(lengh -> System.out.println("Name legnth: " + lengh));
    }
}
