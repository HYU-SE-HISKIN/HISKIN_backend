package hiskin_hiskin_backend.repository;

import hiskin_hiskin_backend.dto.UserAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswersRepository extends JpaRepository<UserAnswers, Long> {
    UserAnswers findByUserId(String userId);
}
