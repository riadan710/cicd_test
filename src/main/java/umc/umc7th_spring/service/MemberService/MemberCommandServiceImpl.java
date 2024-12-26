package umc.umc7th_spring.service.MemberService;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.umc7th_spring.apiPayload.code.status.ErrorStatus;
import umc.umc7th_spring.apiPayload.exception.handler.FoodCategoryHandler;
import umc.umc7th_spring.converter.MemberConverter;
import umc.umc7th_spring.converter.MemberPreferConverter;
import umc.umc7th_spring.domain.FoodCategory;
import umc.umc7th_spring.domain.Member;
import umc.umc7th_spring.domain.mapping.MemberPrefer;
import umc.umc7th_spring.repository.FoodCategoryRepository;
import umc.umc7th_spring.repository.MemberRepository;
import umc.umc7th_spring.web.dto.MemberRequestDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {
    private final MemberRepository memberRepository;

    private final FoodCategoryRepository foodCategoryRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public Member joinMember(MemberRequestDTO.JoinDTO request) {
        Member newMember = MemberConverter.toMember(request);
        newMember.encodePassword(passwordEncoder.encode(request.getPassword()));

        List<FoodCategory> foodCategoryList = request.getPreferCategory().stream()
                .map(category -> {
                    return foodCategoryRepository.findById(category).orElseThrow(() -> new FoodCategoryHandler(ErrorStatus.FOOD_CATEGORY_NOT_FOUND));
                }).collect(Collectors.toList());

        List<MemberPrefer> memberPreferList = MemberPreferConverter.toMemberPreferList(foodCategoryList);

        memberPreferList.forEach(memberPrefer -> {memberPrefer.setMember(newMember);});

        return memberRepository.save(newMember);
    }
}
