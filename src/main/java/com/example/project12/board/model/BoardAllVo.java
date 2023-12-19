package com.example.project12.board.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardAllVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String createdAt;

}
