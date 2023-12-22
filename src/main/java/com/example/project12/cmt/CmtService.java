package com.example.project12.cmt;

import com.example.project12.cmt.model.InsCmtDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CmtService {
    final private CmtMapper mapper;

   public int insCmt(InsCmtDto dto){
       return mapper.insCmt(dto);
   }
}
