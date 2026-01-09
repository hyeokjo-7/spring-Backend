package Head18_;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        Function<Map.Entry<String, Integer>, String> entryStringFunction = new Function<Map.Entry<String, Integer>, String>() {
            @Override
            public String apply(Map.Entry<String, Integer> e) {
                return e.getKey() + ": " + e.getValue();
            }
        };

        scores.entrySet().stream()
                .map(entryStringFunction)
                .forEach(result -> System.out.println("student Info: " + result));
    }
}
