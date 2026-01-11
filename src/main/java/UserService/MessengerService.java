package UserService;

// ===== entity import =====
import Head20_.entity.User;
import Head20_.entity.UserStatus;
import Head20_.entity.Server;
import Head20_.entity.Channel;
import Head20_.entity.Message;

/**
 * 모든 기능을 하나로 합친 인터페이스
 */
public interface MessengerService {

    // =====================
    // 계정 / 인증
    // =====================

    /**
     * 로그인 (이메일 + 비밀번호)
     */
    User login(String email, String password);

    /**
     * 로그아웃
     */
    void logout(User user);

    // =====================
    // 유저
    // =====================

    /**
     * 계정 가입
     */
    User signUp(
            String email,
            String password,
            String address,
            String phone,
            String name,
            String nickname
    );

    /**
     * 유저 상태 변경
     */
    void changeStatus(User user, UserStatus status);

    // =====================
    // 서버
    // =====================

    /**
     * 서버 생성
     */
    Server createServer(String serverName, User owner);

    /**
     * 서버 멤버 추가
     */
    void addMember(Server server, User user);

    // =====================
    // 채널
    // =====================

    /**
     * 채널 생성
     */
    Channel createChannel(Server server, String channelName, int maxUsers);

    /**
     * 채널 참여
     */
    boolean joinChannel(Channel channel, User user);

    // =====================
    // 메시지
    // =====================

    /**
     * 메시지 전송
     */
    Message sendMessage(Channel channel, User sender, String content);

    /**
     * 메시지 읽음 처리
     */
    void readMessage(Message message);
}
