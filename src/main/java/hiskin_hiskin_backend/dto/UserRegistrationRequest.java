package hiskin_hiskin_backend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegistrationRequest {
    private String name;
    private String gender;
    private String birthdate;
    private String nickname;
    private String userId;
    private String password;
}
