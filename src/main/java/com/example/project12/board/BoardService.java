package com.example.project12.board;

import com.example.project12.board.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    final private BoardMapper mapper;

    public int insBoard(BoardDto dto) {
        return mapper.insBoard(dto);
    }

    public int upBoard(BoardDto dto) {

        return mapper.upBoard(dto);
    }

    public List<BoardAllVo> selAllVo(BoardStartDto dto) {
        int startIdx = 0;

        // 페이지가 1 이상이고 lowlen이 0 이상인 경우에만 startIdx를 계산하여 설정
        if (dto.getPage() > 0 && dto.getLowlen() >= 0) {
            startIdx = (dto.getPage() - 1) * dto.getLowlen();
        }
        dto.setStartIdx(startIdx);
        return mapper.selAllBoard(dto);
    }

    public BoardEntity sellByIdBoard(BoardStartDto dto) {
        return mapper.sellByIdBoard(dto);
    }

    public int delBoard(BoardEntity entity) {
        entity.setIboard(entity.getIboard());
        return mapper.delBoard(entity);
    }
}
