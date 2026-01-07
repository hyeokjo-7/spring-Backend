package Head12_;

public class EnumSwitchTest {
    public enum Orderstatus {
        ORDERED, READY, DELIVERED
    }

    public static void printstatus(Orderstatus ststus) {
        switch (ststus) {
            case ORDERED:
                System.out.println("주문됨");
                break;
            case READY:
                System.out.println("준비 완료");
                break;
            case DELIVERED:
                System.out.println("배송됨");
                break;
        }
    }

    public static void main(String[] args) {
        printstatus(Orderstatus.READY);
    }
}