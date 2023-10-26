package hiskin_hiskin_backend.service;

import hiskin_hiskin_backend.domain.SkinDiagnosis;
import hiskin_hiskin_backend.dto.UserAnswers;
import hiskin_hiskin_backend.repository.SkinDiagnosisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkinDiagnosisService {
    @Autowired
    private SkinDiagnosisRepository diagnosisRepository;

    public SkinDiagnosis diagnoseSkinType(UserAnswers answers){}
}
