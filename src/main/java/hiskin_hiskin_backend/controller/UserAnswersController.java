package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.dto.UserAnswers;
import hiskin_hiskin_backend.service.UserAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user-answers")
public class UserAnswersController {
    @Autowired
    private UserAnswersService answersService;

    @PostMapping("/save")
    public ResponseEntity<UserAnswers> saveUserAnswers(@RequestBody UserAnswers answers) {
        UserAnswers savedAnswers = answersService.saveUserAnswers(answers);
        // 저장된 사용자 답변 반환
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserAnswers> getUserAnswers(@PathVariable String userId) {
        UserAnswers answers = answersService.getUserAnswersByUserId(userId);
        // 사용자 답변 조회 결과 반환
    }
}
