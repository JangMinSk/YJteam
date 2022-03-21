package com.example.ArztDB.mapper;

import com.example.ArztDB.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BoardXmlMapper{
    List<BoardVo> boardlist();
    void boardInsert(BoardVo boardVo);

    BoardVo getsubject(BoardVo boardVo);
    BoardVo getwriter(BoardVo boardVo);
    BoardVo getcontent(BoardVo boardVo);

    BoardVo boardDelete(BoardVo boardVo);

    BoardVo boardUpdate(BoardVo boardVo);


    //select * from boardlist
//    List<Map<String, Object>> boardList() throws Exception;

    //Paging
//    List<Map<String, Object>> boardList(Pagination pagination) throws Exception;

    //count
//    int boardCount() throws Exception;
}
