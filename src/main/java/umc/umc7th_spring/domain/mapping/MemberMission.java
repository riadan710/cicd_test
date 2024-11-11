package umc.umc7th_spring.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.umc7th_spring.domain.common.BaseEntity;
import umc.umc7th_spring.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}
