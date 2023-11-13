package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.dto.ChallengeResponseDTO;
import hiskin_hiskin_backend.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ChallengeController {
    @Autowired
    private ChallengeService challengeService;

    @PostMapping("/challenge")
    public ResponseEntity<Map<String, Object>> calculateScore(@RequestBody ChallengeResponseDTO response) {
        int totalScore = challengeService.calculateTotalScore(response);
        challengeService.saveChallengeScore(totalScore);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("totalScore", totalScore);

        return ResponseEntity.ok(responseMap);
    }
}
