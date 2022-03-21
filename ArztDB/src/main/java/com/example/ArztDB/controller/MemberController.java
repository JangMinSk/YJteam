package com.example.ArztDB.controller;

import com.example.ArztDB.service.MemberService;
import com.example.ArztDB.vo.MemberVo;
import com.example.ArztDB.vo.SessionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping(value = "member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("test")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("member/Register");

        return mv;
    }
    //회원 가입(insert)
    @RequestMapping(value ="/reg" , method = RequestMethod.POST )
    public MemberVo memberRegister(@RequestBody MemberVo memberVo) {
        return memberService.memberInsert(memberVo);
    }
    //전체 리스트
    @RequestMapping(value ="/show" , method = RequestMethod.GET )
    public List<MemberVo> userShow() {
        return memberService.getAllMember();
    }

    //로그인
    @RequestMapping(value ="/login" , method = RequestMethod.POST)
    public SessionVo memberLogin(@RequestBody MemberVo memberVo) {
        return memberService.memberLogin(memberVo);
    }
    //세션
    @RequestMapping(value ="/state" , method = RequestMethod.POST )
    public Boolean userState(@RequestBody String str) {
        return memberService.userState(str);
    }

}
