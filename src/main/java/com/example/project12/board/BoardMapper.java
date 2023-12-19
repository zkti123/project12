package com.example.project12.board;

import com.example.project12.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardDto dto);

    int upBoard(BoardDto dto);

    List<BoardAllVo> selAllBoard(BoardStartDto dto);

    BoardEntity sellByIdBoard(BoardStartDto dto);

    int delBoard(BoardEntity entity);
}
