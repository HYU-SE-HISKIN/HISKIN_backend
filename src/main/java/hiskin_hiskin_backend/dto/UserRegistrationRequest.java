package hiskin_hiskin_backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationRequest {
    // 생년월일 삭제
    private String gender;
    private String name;
    private String nickname;
    private String userId;
    private String password;
}
