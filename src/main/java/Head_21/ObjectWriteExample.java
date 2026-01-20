package Head_21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteExample {
    public static void main(String[] args) {
        User user = new User("Alice", 30);
// 직렬화
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("직렬화 완료: user.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
