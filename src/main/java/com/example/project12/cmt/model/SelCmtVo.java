package com.example.project12.cmt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class SelCmtVo {
private int icmt;
private String ctnt;
private String writer;
private String createdAt;
private String updatedAt;
}
