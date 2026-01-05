package head06_;

import org.example.head03_oop.Order;

public class PaymentService {
    private static final PaymentService INSTANCE = new PaymentService();

    private PaymentService() {
        // 외부 인스턴스 생성을 막음
    }

    public static PaymentService getInstance() {
        return INSTANCE;
    }

    public boolean pay(Order order, double amount) {
        // 결제 처리 로직
        return true;
    }
}

