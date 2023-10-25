package hiskin_hiskin_backend.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")  // "users" 테이블과 매핑
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="gender", nullable = false)
    private String gender;

    @Column(name="birthdate", nullable = false)
    private String birthdate;

    @Column(name="nickname", nullable = false)
    private String nickname;

    @Column(name="userId", nullable = false)
    private String userId;  // 사용자 아이디

    @Column(name="password", nullable = false)
    private String password;

    @Builder
    public User(String name, String gender, String birthdate, String nickname, String userId, String password) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
        this.nickname = nickname;
        this.userId = userId;
        this.password = password;
    }
}
