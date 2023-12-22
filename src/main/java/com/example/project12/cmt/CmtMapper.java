package com.example.project12.cmt;

import com.example.project12.cmt.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmtMapper {
    int insCmt(InsCmtDto dto);

    List<SelCmtVo> selCmt(SelCmtDto dto);

    int delCmt(DelCmtDto dto);


}
