package Head20_;

import java.util.UUID;

/**
 * 모든 엔티티가 공통으로 가지는 필드
 */
public abstract class BaseEntity {

    protected UUID id;          // 고유 번호 (UUID)
    protected long createdAt;    // 생성 시간
    protected long updatedAt;    // 수정 시간

    protected BaseEntity() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = this.createdAt;
    }
}