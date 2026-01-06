package Head13_;

public class EmailNotificationSender implements NotificationSender {

    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
