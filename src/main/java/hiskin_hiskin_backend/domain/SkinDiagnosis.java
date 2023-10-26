package hiskin_hiskin_backend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SkinDiagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private int oilyVsDryScore;
    private int sensitiveVsResistantScore;
    private int pigmentedVsNonPigmentedScore;
    private int wrinkledVsTightScore;
    private String skinType;
}
