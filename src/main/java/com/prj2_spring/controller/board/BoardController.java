package com.prj2_spring.controller.board;

import com.prj2_spring.controller.service.board.BoardService;
import com.prj2_spring.domain.board.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @PostMapping("add")
    public void add(@RequestBody Board board) {

        service.add(board);
    }
}
