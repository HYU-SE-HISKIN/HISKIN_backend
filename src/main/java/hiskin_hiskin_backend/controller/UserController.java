package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.domain.User;
import hiskin_hiskin_backend.dto.UserLoginRequest;
import hiskin_hiskin_backend.dto.UserRegistrationRequest;
import hiskin_hiskin_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest registrationRequest) {
        try {
            // 회원가입 로직: 사용자를 생성하고 저장
            User newUser = new User(registrationRequest.getUserId(), registrationRequest.getPassword(),
                    registrationRequest.getName(), registrationRequest.getNickname(),
                    registrationRequest.getGender(), registrationRequest.getBirthdate());
            userRepository.save(newUser);

            // 성공적인 응답 반환
            return new ResponseEntity<>("Registration successful@@@", HttpStatus.OK);
        } catch (Exception e) {
            // 실패한 응답 반환
            return new ResponseEntity<>("Registration failed: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginRequest loginRequest) {
        try {
            // 로그인 로직: 사용자 확인
            User user = userRepository.findByUserId(loginRequest.getUserId());

            if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
                // 로그인 성공
                // 여기에서 토큰 생성 및 반환 가능
                return new ResponseEntity<>("Login successful", HttpStatus.OK);
            } else {
                // 로그인 실패
                return new ResponseEntity<>("Login failed: Invalid credentials", HttpStatus.UNAUTHORIZED);
            }
        } catch (Exception e) {
            // 로그인 실패
            return new ResponseEntity<>("Login failed: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
