package com.example.ArztDB.mapper;

import com.example.ArztDB.paging.Pagination;

import com.example.ArztDB.vo.BoardVo;
import com.example.ArztDB.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BoardXmlMapper{

    List<BoardVo> boardlist();
    void boardInsert(BoardVo boardVo);
    BoardVo getsubject(BoardVo boardVo);
    BoardVo getcontent(BoardVo boardVo);
    //select * from boardlist
//    List<Map<String, Object>> boardList() throws Exception;

    //Paging
//    List<Map<String, Object>> boardList(Pagination pagination) throws Exception;

    //count
//    int boardCount() throws Exception;
}
