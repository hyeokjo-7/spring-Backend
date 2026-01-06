package Head13_;

public interface NotificationSender {
    void send(String message);
}

public class SmsNotificationSender implements NotificationSender {
    public void send(String message) {
        System.out.println("SMS 전송: " + message);
    }
}



