package com.example.project12.cmt;

import com.example.project12.cmt.model.InsCmtDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cmt")
@RequiredArgsConstructor
public class CmtController {
    final private CmtService service;

    @PostMapping
    public int postCmt(InsCmtDto dto) {
        return service.insCmt(dto);
    }
}
