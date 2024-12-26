package umc.umc7th_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.umc7th_spring.domain.FoodCategory;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}
