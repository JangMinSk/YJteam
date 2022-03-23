package com.example.ArztDB.service;

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
        System.out.println("생성완료");
        System.out.println(boardVo.toString());
        mapper.boardInsert(boardVo);

        return boardVo;
    }
    @Override
    public  BoardVo boardDelete(BoardVo boardVo){
        return mapper.boardDelete(boardVo);
    }

    @Override
    public  BoardVo boardUpdate(BoardVo boardVo){
        System.out.println("변경");

       return mapper.boardUpdate(boardVo);
    }
}


