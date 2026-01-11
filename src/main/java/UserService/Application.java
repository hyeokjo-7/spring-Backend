package UserService;

import Head20_.entity.*;
import Head20_.UserService.MessengerService;

/**
 * 프로그램 실행 진입점
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("===== 프로그램 시작 =====");

        /*
         * ⚠️ 현재 MessengerService는 인터페이스만 있음
         * 실제 구현체(MessengerServiceImpl)는 아직 없으므로
         * 아래에서는 '가짜 흐름' 위주로 구조만 확인
         */

        // ===== 계정 생성 (엔티티 직접 생성) =====
        User user = new User("test@email.com", "hyukjo");
        System.out.println("유저 생성 완료");

        // ===== 유저 상태 변경 =====
        UserStatus status = UserStatus.STUDY;
        System.out.println("유저 상태: " + status);

        // ===== 서버 생성 =====
        Server server = new Server("공부 서버", user);
        System.out.println("서버 생성 완료");

        // ===== 채널 생성 =====
        Channel channel = new Channel("자바 채널", 10, server);
        System.out.println("채널 생성 완료");

        // ===== 메시지 생성 =====
        Message message = new Message("안녕하세요!", user, channel);
        System.out.println("메시지 생성 완료");

        // ===== 정상 구동 확인 =====
        System.out.println("모든 객체 생성 및 흐름 정상");

        // ===== 종료 =====
        System.out.println("===== 프로그램 종료 =====");
    }
}
