package com.example.project12.board;

import com.example.project12.board.model.BoardDto;
import com.example.project12.board.model.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    final private BoardMapper mapper;

    public int insBoard(BoardDto entity) {
        return mapper.insBoard(entity);
    }
}
