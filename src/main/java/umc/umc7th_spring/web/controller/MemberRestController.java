package umc.umc7th_spring.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.umc7th_spring.apiPayload.ApiResponse;
import umc.umc7th_spring.converter.MemberConverter;
import umc.umc7th_spring.domain.Member;
import umc.umc7th_spring.service.MemberService.MemberCommandService;
import umc.umc7th_spring.web.dto.MemberRequestDTO;
import umc.umc7th_spring.web.dto.MemberResponseDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {
    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(
            @RequestBody
            @Valid
            MemberRequestDTO.JoinDTO request
    ) {
        Member member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(MemberConverter.toJoinResultDTO(member));
    }
}
