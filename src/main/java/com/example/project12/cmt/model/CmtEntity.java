package com.example.project12.cmt.model;

import lombok.Data;

@Data
public class CmtEntity {
    private int icmt;
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String pw;
    private String createdAt;
    private String updatedAt;
}
