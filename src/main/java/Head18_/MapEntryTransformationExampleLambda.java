package Head18_;

import java.util.HashMap;
import java.util.Map;


public class MapEntryTransformationExampleLambda {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        scores.entrySet().stream()
                .map(e -> e.getKey() + ": " + e.getValue())

                .forEach(result -> System.out.println("student Info: " + result));
    }
}
