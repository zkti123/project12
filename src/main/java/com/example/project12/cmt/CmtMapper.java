package com.example.project12.cmt;

import com.example.project12.cmt.model.InsCmtDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmtMapper {
    int insCmt(InsCmtDto dto);
}
