package Head20_;

import java.nio.channels.Channel;
import java.util.ArrayList;
import java.util.List;

/**
 * 서버 (여러 채널을 가짐)
 */
public class Server extends BaseEntity {

    private String serverName;
    private User owner;                  // 방장
    private List<User> members = new ArrayList<>();
    private List<Channel> channels = new ArrayList<>();

    public Server(String serverName, User owner) {
        super();
        this.serverName = serverName;
        this.owner = owner;
        this.members.add(owner);
    }

    /** 서버에 유저 추가 */
    public void addMember(User user) {
        members.add(user);
    }

    /** 채널 생성 */
    public void addChannel(Channel channel) {
        channels.add(channel);
    }
}
