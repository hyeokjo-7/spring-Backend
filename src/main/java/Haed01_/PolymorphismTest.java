package Haed01_;

public class PolymorphismTest {
    public static void main(String[] args) {
        Payment[] payments = new Payment[]
                {
                        new CreditCardPayment(),
                        new AccountTransferPayment(),

                };
        double[] paymentAmounts = new double[] {
                30000,
                70000
        };
        OrderService service = new OrderService();
        for (Payment payment : payments) {
            if(payment instanceof CreditCardPayment) {
                service.processPayment(payment, paymentAmounts[0]);
            } else if(payment instanceof AccountTransferPayment) {
                service.processPayment(payment, paymentAmounts[1]);
//            } else if(payment instanceof ) {
//                service.processPayment(payment, paymentAmounts[2]);
            } else {
                service.processPayment(payment, 1000);
            }
        }
    }
}

