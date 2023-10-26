package hiskin_hiskin_backend.repository;

import hiskin_hiskin_backend.domain.SkinDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkinDiagnosisRepository extends JpaRepository<SkinDiagnosis, Long> {

}
