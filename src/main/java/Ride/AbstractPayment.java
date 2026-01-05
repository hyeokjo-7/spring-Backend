package Ride;

public abstract class AbstractPayment {
    // 공통 검증 로직
    protected void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("결제 금액이 유효하지 않습니다.");
        }
    }

    // 공통 취소 검증 로직
    protected void validateCancel(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("취소 금액이 유효하지 않습니다.");
        }
    }

    // 추상 메소드: 구체 클래스가 구현해야 함
    public abstract void pay(double amount);
    public abstract void cancel(double amount);
}

public class CreditCardPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("신용카드 결제 완료: " + amount + "원");
    }

    @Override
    public void cancel(double amount) {
        validateCancel(amount);
        System.out.println("신용카드 결제 취소: " + amount + "원");
    }
}

public class AccountTransferPayment extends AbstractPayment {
    @Override
    public void pay(double amount) {
        validatePayment(amount);
        System.out.println("계좌이체 결제 완료: " + amount + "원");
    }

    @Override
    public void cancel(double amount) {
        validateCancel(amount);
        System.out.println("계좌이체 결제 취소: " + amount + "원");
    }
}

