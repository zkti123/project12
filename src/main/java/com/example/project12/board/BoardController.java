package com.example.project12.board;

import com.example.project12.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<BoardAllVo> getBaord(@RequestParam(defaultValue = "1") int page,
                                     @RequestParam(defaultValue = "5", required = false) int low) {
        BoardStartDto dto = new BoardStartDto();
        dto.setPage(page);
        dto.setLowlen(low);
        return service.selAllVo(dto);
    }

    @GetMapping("/{iboard}")
    public BoardEntity getDetailBaord(@PathVariable int iboard) {
        BoardStartDto dto = new BoardStartDto();
        dto.setIboard(iboard);
        return service.sellByIdBoard(dto);
    }

    @DeleteMapping
    public int delBoard(@RequestParam int iboard) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        return service.delBoard(entity);
    }
}
