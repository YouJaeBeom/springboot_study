package org.example.firstproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.firstproject.dto.MemberForm;
import org.example.firstproject.entity.Member;
import org.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/singup")
    public String joinForm() {
        return "members/new";
    }

    @PostMapping("/join")
    public String join(MemberForm form) {
        Member member = form.toEntity();
        log.info(member.toString());
//        System.out.println(member.toString());
        Member saved = memberRepository.save(member);
//        System.out.println(saved.toString());
        log.info(saved.toString());
        return "";
    }
}
