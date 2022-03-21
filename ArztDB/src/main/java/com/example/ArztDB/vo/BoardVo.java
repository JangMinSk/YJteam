package com.example.ArztDB.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardVo {

    //작성일자
    @JsonProperty
    private Date date;

    //PK
    @JsonProperty
    private String bno;

    //제목
    @JsonProperty
    private String subject;

    //내용
    @JsonProperty
    private String content;

    //작성자
    @JsonProperty
    private String writer;

}
