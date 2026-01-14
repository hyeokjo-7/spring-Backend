package discodeit.entity;

import java.util.UUID;

public class Channel {
    private UUID id;
    private String channel;
    private String name;
    private String email;
    private Long ceratedAt;
    private Long updataAt;

    public UUID getId() {
        return id;
    }

    public String getChannel() {
        return channel;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getCeratedAt() {
        return ceratedAt;
    }

    public Long getUpdataAt() {
        return updataAt;
    }

    public Channel(String channel, String name, String email){
        this.id = UUID.randomUUID();
        this.channel = channel;
        this.name = name;
        this.email = email;


    }


}
