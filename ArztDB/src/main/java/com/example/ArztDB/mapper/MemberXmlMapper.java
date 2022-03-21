package com.example.ArztDB.mapper;

import com.example.ArztDB.vo.MemberVo;
import com.example.ArztDB.vo.SessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberXmlMapper {
    List<MemberVo> getAllMember();
    MemberVo getMember(MemberVo memberVo);
    void memberInsert(MemberVo memberVo);
    MemberVo getId(MemberVo memberVo);
    MemberVo getPhone(MemberVo memberVo);
    MemberVo getMail(MemberVo memberVo);
    void login(SessionVo sessionVo);
    List<SessionVo> getAllSession();

    SessionVo getSession(SessionVo sessionVo);
    SessionVo logout();

}

