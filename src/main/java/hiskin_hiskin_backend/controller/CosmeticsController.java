package hiskin_hiskin_backend.controller;

import hiskin_hiskin_backend.service.CosmeticsCrawlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class CosmeticsController {
    @Autowired
    private CosmeticsCrawlerService cosmeticsCrawlerService;

    @GetMapping("/cosmetics")
    public ResponseEntity<Map<String, String>> searchCosmetics() {
        Map<String, String> productInfo = cosmeticsCrawlerService.scrapeProductInfo();
        return new ResponseEntity<>(productInfo, HttpStatus.OK);
    }
}

/*
selenium 라이브러리 사용방법:
1. 크롬 버전 확인
2. 크롬 버전이랑 일치하는 크롬드라이버 설치
3. 크롬드라이버를 static 파일에 넣고 그 경로를 CosmeticsCrawlerService 클래스 path에 입력

현재 크롤링이 잘 되는지 test 하기 위해 임의로 "닥터지" 라는 검색어를 입력했을 때 productName이랑 imageUrl이 json형식으로
잘 출력되는지 Postman을 통해서 확인 -> 성공

코드 수정 방향:
LoggedInUserHolder를 통해 사용자가 로그인을 하면 userId를 저장해놓고 이 아이디를 통해 사용자 db를 조회하여 나온 스킨타입에 따른
검색어를 올리브영 사이트에서 검색하여 productName과 imageUrl을 크롤링하여 프론트로 넘겨줌
 */
