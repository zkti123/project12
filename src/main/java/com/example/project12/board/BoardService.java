package com.example.project12.board;

import com.example.project12.board.model.BoardDto;
import com.example.project12.board.model.BoardEntity;
import com.example.project12.board.model.BoardIboard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
