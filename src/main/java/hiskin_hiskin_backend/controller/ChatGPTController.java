package hiskin_hiskin_backend.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import hiskin_hiskin_backend.dto.ChatRequest;
import hiskin_hiskin_backend.service.ChatGPTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatGPTController {
    @Autowired
    private ChatGPTService chatGPTService;
    @Autowired
    public ChatGPTController(ChatGPTService chatGPTService) {
        this.chatGPTService = chatGPTService;
    }

    @PostMapping("/ask")
    public ResponseEntity<String> askChatGPT(@RequestBody ChatRequest chatRequest) {
        String question = chatRequest.getQuestion();
        String response = chatGPTService.askChatGPT(question);

        // Extracting "content" from the response and returning it to the frontend
        String content = extractContentFromResponse(response);
        return ResponseEntity.ok(content);
    }

    private String extractContentFromResponse(String response) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(response);

            // "choices" 배열의 첫 번째 요소에서 "message" 객체의 "content" 필드를 추출합니다.
            JsonNode contentNode = jsonNode.at("/choices/0/message/content");

            // JsonNode를 String으로 변환
            String content = contentNode.asText();

            return content;
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: Failed to extract content from response";
        }
    }
}
