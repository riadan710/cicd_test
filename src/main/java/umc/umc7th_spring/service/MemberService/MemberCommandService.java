package umc.umc7th_spring.service.MemberService;

import umc.umc7th_spring.domain.Member;
import umc.umc7th_spring.web.dto.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDTO request);
}
