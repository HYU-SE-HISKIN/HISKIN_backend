package hiskin_hiskin_backend.service;

import hiskin_hiskin_backend.dto.ChallengeResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class ChallengeService {
    public int calculateTotalScore(ChallengeResponseDTO response) {
        int scoreQuestion1 = calculateScore(response.getQuestion1());
        int scoreQuestion2 = calculateScore(response.getQuestion2());
        int scoreQuestion3 = calculateScore(response.getQuestion3());
        int scoreQuestion4 = calculateScore(response.getQuestion4());

        return scoreQuestion1 + scoreQuestion2 + scoreQuestion3 + scoreQuestion4;
    }

    // 사용자 답변에 따라 챌린지 점수를 부여
    // 매우 잘함: 25점, 잘함: 20점, 보통: 15점, 못함: 10점, 매우 못함: 5점
    private int calculateScore(int answer) {
        switch (answer) {
            case 1:
                return 5;
            case 2:
                return 10;
            case 3:
                return 15;
            case 4:
                return 20;
            case 5:
                return 25;
            default:
                return 0;
        }
    }
}
