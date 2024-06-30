package com.example.minecraft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.minecraft.entity.Board;
import com.example.minecraft.repository.BoardRepository;

@Service
public class BoardService {
    
    @Autowired
    private BoardRepository boardRepository;

    public Page<Board> boardList(Pageable pageable){
        return boardRepository.findAll(pageable);
    }
}
