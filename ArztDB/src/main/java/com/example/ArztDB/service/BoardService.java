package com.example.ArztDB.service;

import com.example.ArztDB.paging.Pagination;
import com.example.ArztDB.mapper.BoardXmlMapper;
import com.example.ArztDB.repository.BoardRepository;

import com.example.ArztDB.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BoardService implements BoardRepository {

    @Autowired
    BoardXmlMapper mapper;

    @Override
    public List<BoardVo> boardlist(){
        return mapper.boardlist();
    }

    @Override
    public BoardVo boardInsert(BoardVo boardVo){
        while (true) {
            String board_subject = mapper.getsubject(boardVo) == null ? null : boardVo.getSubject();
            String board_content = mapper.getcontent(boardVo) == null ? null : boardVo.getContent();

            if (board_subject == null || board_content == null) {
                System.out.println("제목 혹은 내용을 입력하여 주세요");
                continue;
            }
                mapper.boardInsert(boardVo);
            break;
        }
        ;
        return boardVo;
    }
//    @Override
//    public List<Map<String, Object>> boardList() throws Exception {
//
//        return mapper.boardList();
//    }
//
//    @Override
//    public List<Map<String, Object>> boardList(Pagination pagination) throws Exception {
//
//        return mapper.boardList(pagination);
//    }
//
//    @Override
//    public int boardCount() throws Exception {
//
//        return mapper.boardCount();
//    }
}


