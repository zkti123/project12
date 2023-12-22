package com.example.project12.cmt;

import com.example.project12.cmt.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cmt")
@RequiredArgsConstructor
public class CmtController {
    final private CmtService service;

    @PostMapping
    public int postCmt(@RequestBody InsCmtDto dto) {
        return service.insCmt(dto);
    }

    @GetMapping("/{iboard}")
    public List<SelCmtVo> getCmt(@PathVariable int iboard) {
        SelCmtDto dto = new SelCmtDto();
        dto.setIboard(iboard);
        return service.selCmt(dto);
    }

    @DeleteMapping
    public int delCmt(@RequestBody DelCmtDto dto) {
        return service.delCmt(dto);
    }


}
