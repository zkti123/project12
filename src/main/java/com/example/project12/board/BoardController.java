package com.example.project12.board;

import com.example.project12.board.model.BoardDto;
import com.example.project12.board.model.BoardEntity;
import com.example.project12.board.model.BoardIboard;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    final private BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardDto dto) {
        return service.insBoard(dto);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardDto dto, @RequestParam(required = false) int iboard) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        return service.upBoard(dto);
    }
}
