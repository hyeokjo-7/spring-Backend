package org.example.head04_;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;
    boolean isPaid;

    // 기본 생성자
    public Order() {
        this.orderId = "NONE";
        this.products = new ArrayList<>();
        this.isPaid = false;
    }

    // 오버로딩된 생성자
    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.isPaid = false;
    }

    // this() 호출 예시
    public Order(String orderId) {
        this.orderId = orderId;
    }

    public Order(List<Product> products) {
        this.products = products;
    }

    public Order(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Product[] getProducts() {
        return new Product[0];
    }

    public String getOrderId() {
        return "";
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean ispaid) {
        this.isPaid = ispaid;
    }
}

