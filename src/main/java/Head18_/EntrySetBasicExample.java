package Head18_;

import java.util.HashMap;
import java.util.Map;

public class EntrySetBasicExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Korea",  "Korea");
        capitals.put("Japan",  "Tokyo");
        capitals.put("USA",  "Washington D.C.");

        for (Map.Entry<String, String> entry: capitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", capital: " + entry.getValue());
        }

    }
}
