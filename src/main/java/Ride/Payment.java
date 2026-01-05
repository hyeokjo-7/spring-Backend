package Ride;

public interface Payment {
    void pay(double amount);
}

// 지나치게 세분화된 클래스
public class SmallCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("소액(신용카드) 결제: " + amount + "원");
    }
}

public class BigCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("고액(신용카드) 결제: " + amount + "원");
    }
}

public class MediumCreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("중간 금액(신용카드) 결제: " + amount + "원");
    }
}

