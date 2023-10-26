package hiskin_hiskin_backend.service;

import hiskin_hiskin_backend.dto.UserAnswers;
import hiskin_hiskin_backend.repository.UserAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAnswersService {
    @Autowired
    private UserAnswersRepository answersRepository;

    public UserAnswers saveUserAnswers(UserAnswers answers) {
        // 사용자 답변 저장 로직
    }

    public UserAnswers getUserAnswersByUserId(String userId) {
        // 사용자 ID를 기반으로 사용자 답변 조회 로직
    }
}
