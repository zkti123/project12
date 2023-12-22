package com.example.project12.cmt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UpCmtDto {
    private int icmt;
    private String ctnt;
    private  String writer;
}
