package com.example.ArztDB.vo;

import lombok.Data;

@Data
public class CartListVo {

    //count
    private String order_No;

    //찜목록 날짜
    private String order_time;

    //찜목록 이름
    private String order_subject;

    //가격
    private String price;
}
