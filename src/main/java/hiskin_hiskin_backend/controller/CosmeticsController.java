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
