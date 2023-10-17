package hiskin_hiskin_backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserSelectionController {
    @GetMapping("/user-selection")
    public String userSelectionPage(){
        return "user-selection";
    }
}
