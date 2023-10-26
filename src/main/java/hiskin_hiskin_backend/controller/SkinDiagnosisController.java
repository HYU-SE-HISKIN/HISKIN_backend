package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.domain.SkinDiagnosis;
import hiskin_hiskin_backend.dto.UserAnswers;
import hiskin_hiskin_backend.service.SkinDiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/skin-diagnosis")
public class SkinDiagnosisController {
    @Autowired
    private SkinDiagnosisService diagnosisService;

    @PostMapping("/diagnosis")
    public ResponseEntity<SkinDiagnosis> diagnoseSkinType(@RequestBody UserAnswers answers) {
        SkinDiagnosis result = diagnosisService.diagnoseSkinType(answers);
        // 결과 반환
    }
}
