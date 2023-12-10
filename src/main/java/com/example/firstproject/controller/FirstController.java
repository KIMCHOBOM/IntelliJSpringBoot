package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;    //Model 클래스 패키지 임포트
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {  //model 객체 받아 오기
        //model 객체가 "초봄" 값을 "username"에 연결해 웹 브라우저로 보냄
        //model.addAttribute("username", "초봄");   //model.addAttribute("변수명", 변수값); -- 변수값을 "변수명"이라는 이름으로 추가
        model.addAttribute("username", "chobom");   // "초봄" → "chobom" 수정
        return "greetings";     //greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "김초봄");
        return "goodbye";
    }

}
