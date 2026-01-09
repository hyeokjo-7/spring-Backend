package Head17_;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("Korea");
        countries.add("Japan");
        countries.add("China");
        countries.add("Korea");

        System.out.println("contins 'Japan' ? " + countries.contains("Japan"));

        countries.remove("China");
        System.out.println("After remove 'Caina' : " + countries);

        System.out.println("Set size: " + countries.size());

        countries.clear();
        System.out.println("After ciear: " + countries);
    }
}
