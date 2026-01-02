package org.example.Head02_javaPrograming;

public class ReferenceExample {
    public static void main(String[] args) {
        // 기본 타입
        int a = 10;
//        int b = a;

        System.out.println(a); // 10 (영향 없음)

        // 참조 타입
        int[] arr1 = {1, 2, 3};
//        int[] arr2 = arr1;

        System.out.println(arr1[0]); // 100 (같은 객체 참조)
    }
}