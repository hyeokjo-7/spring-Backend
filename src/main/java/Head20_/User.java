package Head20_;


import java.util.UUID;

public class User extends BaseEntity {

    private String email;        // 이메일 (아이디 역할)
    private String password;     // 비밀번호 (실제 서비스에선 암호화)
    private String address;      // 주소
    private String phone;        // 전화번호
    private String name;         // 실명
    private String nickname;     // 기본 닉네임

    private UserStatus status;   // 유저 상황 (활동 상태)

    public User(String email, String password, String address,
                String phone, String name, String nickname) {
        super();
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.nickname = nickname;
        this.status = UserStatus.ACTIVE;
    }

    /** {로그인} - 아이디 / 비밀번호 체크 */
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    /** {유저 상황 변경} */
    public void changeStatus(UserStatus status) {
        this.status = status;
        this.updatedAt = System.currentTimeMillis();
    }

    public UUID getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}
