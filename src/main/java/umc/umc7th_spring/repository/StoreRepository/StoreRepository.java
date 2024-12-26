package umc.umc7th_spring.repository.StoreRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.umc7th_spring.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
