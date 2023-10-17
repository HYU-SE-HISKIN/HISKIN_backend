package hiskin_hiskin_backend.domain;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_seq", updatable = false)
    private Long user_seq;
    @Column(name ="id", updatable = false)
    private String id;
    @Column(name="password", updatable = false)
    private String password;

    @Builder
    public User(String id, String password){
        this.id=id;
        this.password=password;
    }
}
