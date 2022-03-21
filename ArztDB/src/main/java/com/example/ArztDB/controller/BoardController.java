package com.example.ArztDB.controller;


import com.example.ArztDB.service.BoardService;
import com.example.ArztDB.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "board")
@RestController
public class BoardController {
    @Autowired
    BoardService boardService;

    //전체 리스트
    @RequestMapping(value ="/list" , method = RequestMethod.GET )
    public List<BoardVo> allboardist(){
        return boardService.boardlist();
    }

    //계시글 생성
    @RequestMapping(value = "/listinsert",method = RequestMethod.POST)
    public BoardVo boardInsert(@RequestBody BoardVo boardVo){
        return boardService.boardInsert(boardVo);
    }
}
