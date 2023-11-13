package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.dto.ChallengeResponseDTO;
import hiskin_hiskin_backend.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChallengeController {
    @Autowired
    private ChallengeService challengeService;

    @PostMapping("/challenge")
    public ResponseEntity<String> calculateScore(@RequestBody ChallengeResponseDTO response) {
        int totalScore = challengeService.calculateTotalScore(response);
        return ResponseEntity.ok("Total Score: " + totalScore);
    }
}
