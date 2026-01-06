package Haed08_;

public class OrderService {
    public void processPayment(Payment paymentMethod, double amount) {
        // Payment 인터페이스 기반으로 다형성 처리
        paymentMethod.pay(amount);
    }
}

