package Head18_;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class FilterMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 75);
        scores.put("Park", 88);

        Predicate<Map.Entry<String, Integer>> highscore = new Predicate<Map.Entry<String, Integer>>() {
            @Override
            public boolean test(Map.Entry<String, Integer> stringIntegerEntry) {
                return stringIntegerEntry.getValue() >= 80;
            }
        };

        scores.entrySet().stream()
                .filter(highscore)
                .forEach(entry ->
                        System.out.println("High Scorer: " + entry.getKey() + " => " + entry.getValue()));
    }
}
