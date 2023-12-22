package com.example.project12.cmt;

import com.example.project12.cmt.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CmtService {
    final private CmtMapper mapper;

   public int insCmt(InsCmtDto dto){
       return mapper.insCmt(dto);
   }

   public List<SelCmtVo> selCmt(SelCmtDto dto) {
       return mapper.selCmt(dto);
   }

   public int delCmt(DelCmtDto dto) {
       return mapper.delCmt(dto);
   }

}
