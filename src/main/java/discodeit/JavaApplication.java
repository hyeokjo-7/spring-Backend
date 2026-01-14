package discodeit;

import discodeit.JCF.JCFUserService;
import discodeit.Service.UserService;
import discodeit.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JavaApplication {
    public static void main(String[] args) {
        UserService userService = new JCFUserService();

        User user = userService.create("정혁조", "dy960508@naver.com", "010-1234-5678");
        User user1 = userService.create("복슬이", "ddochy7777@gmail.com", "010-9876-5432");

        System.out.println("유저 생성: " + user.getName());

        User foundUser = userService.find(user.getId());
        System.out.println("단건 조회: " + foundUser);

        List<User> users = userService.findAll();
        System.out.println("다건 조회: " + users);
        // 실행 시 단건 조회라 수정
        User update = userService.update(user.getId(),"정혁조", "dy960508@naver.com", "010-1234-5678");
        System.out.println("수정된 유저: " + update);
    }
}

