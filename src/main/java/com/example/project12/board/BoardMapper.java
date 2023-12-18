package com.example.project12.board;

import com.example.project12.board.model.BoardDto;
import com.example.project12.board.model.BoardEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    int insBoard(BoardDto entity);
}
