package Head18_;

import java.util.Arrays;
import java.util.List;

public class MapNamesExampleLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bod", "Charlie");

        names.stream()
                .map(s -> {
                    return s.toUpperCase();
                })
                .forEach(length -> System.out.println("Name length: " + length));
    }
}
