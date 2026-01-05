package Ride;

public class CreditCardPayment {
    public void pay(double amount) {
        // 결제 검증 로직
        // 결제 실행
        System.out.println("신용카드 결제 완료: " + amount + "원");
    }

    public void cancel(double amount) {
        // 결제 취소 검증 로직
        // 결제 취소
        System.out.println("신용카드 결제 취소: " + amount + "원");
    }
}

public class AccountTransferPayment {
    public void pay(double amount) {
        // 결제 검증 로직
        // 결제 실행
        System.out.println("계좌이체 결제 완료: " + amount + "원");
    }

    public void cancel(double amount) {
        // 결제 취소 검증 로직
        // 결제 취소
        System.out.println("계좌이체 결제 취소: " + amount + "원");
    }
}
