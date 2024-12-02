package umc.umc7th_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.umc7th_spring.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
}
