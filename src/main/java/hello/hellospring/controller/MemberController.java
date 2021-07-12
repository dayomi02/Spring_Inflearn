package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;
//    DI방법 : 필드 주입
//    @Autowired private MemberService memberService;

//    DI방법 : setter 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

//    DI방법 :  생성자 주입 (요즘 가장 많이 사용하는 방법)
//    Controller와 Service를 연결시켜줌
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
