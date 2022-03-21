package com.example.ArztDB.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.ArztDB.paging.Pagination;
import com.example.ArztDB.vo.BoardVo;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository {

    List<BoardVo> boardlist();

    BoardVo boardInsert(BoardVo boardVo);
    //select * from Test_Table
//    List<Map<String, Object>> boardList() throws Exception;

    //Paging
//    List<Map<String, Object>> boardList(Pagination pagination) throws Exception;

    //count
//    int boardCount() throws Exception;
}