package org.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;

// URL 연결 요청과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;

// Model 클래스 패키지 자동 임포트
import org.springframework.ui.Model;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "홍팍");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username", "뽀로로");
        return "goodbye";
    }
}
