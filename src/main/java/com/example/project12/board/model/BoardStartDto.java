package com.example.project12.board.model;

import lombok.Data;

@Data
public class BoardStartDto extends BoardEntity {
    private int page;
    private int startIdx;
    private int lowlen;

}
