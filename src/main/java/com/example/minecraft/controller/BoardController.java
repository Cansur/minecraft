package com.example.minecraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RestController;

import com.example.minecraft.entity.Board;
import com.example.minecraft.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BoardController {
    
    @Autowired
    private BoardService boardService;

    // @GetMapping("/api/board/list")
    // public List<Board> getBoardList(@PageableDefault(page=0,size=10,sort="id",direction = Sort.Direction.DESC) Pageable pageable) {
    //     Page<Board> boards = boardService.boardList(pageable);
    //     return boards.getContent();
    // }
    
}
