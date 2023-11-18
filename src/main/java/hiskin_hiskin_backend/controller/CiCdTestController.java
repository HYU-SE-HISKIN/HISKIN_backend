package hiskin_hiskin_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CiCdTestController {
    @GetMapping("/test")
    public String test(){
        return "성공";
    }
}
