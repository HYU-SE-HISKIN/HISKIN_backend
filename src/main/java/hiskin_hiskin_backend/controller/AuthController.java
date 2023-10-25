package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.domain.User;
import hiskin_hiskin_backend.dto.UserLoginRequest;
import hiskin_hiskin_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        // 중복 사용자 확인
        User existingUser = userRepository.findByUserId(user.getUserId());
        if (existingUser != null) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("이미 존재하는 사용자입니다.");
        }

        // 사용자 정보를 데이터베이스에 저장
        userRepository.save(user);

        return ResponseEntity.ok("회원가입이 성공적으로 완료되었습니다.");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest loginRequest) {
        // 아이디, 비밀번호를 가져오기
        String userId = loginRequest.getUserId();
        String password = loginRequest.getPassword();

        // 아이디로 사용자를 찾기
        User user = userRepository.findByUserId(userId);

        if (user == null || !user.getPassword().equals(password)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }

        return ResponseEntity.ok("로그인 성공");
    }
}

