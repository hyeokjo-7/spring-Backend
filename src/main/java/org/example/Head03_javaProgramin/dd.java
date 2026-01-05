package org.example.Head03_javaProgramin;

public class dd {
    public static void main(String[] args) {

        int sum = 0;

        // 1 → 20
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }

        // 19 → 1
        for (int i = 19; i >= 1; i--) {
            sum += i;
        }

        System.out.println(sum); // 400
    }
}
