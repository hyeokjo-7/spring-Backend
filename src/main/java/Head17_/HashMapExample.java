package Head17_;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 95);
        System.out.println("After put: " + scores);

        scores.put("Lee", 88);
        System.out.println("After updating 'Lee': " + scores);

        int parkscore = scores.get("Park");
        System.out.println("Park's score: " + parkscore);

        System.out.println("Kim");
        System.out.println("After remove 'Kim': " + scores);

        System.out.println("All keys: " + scores.keySet());
    }
}
