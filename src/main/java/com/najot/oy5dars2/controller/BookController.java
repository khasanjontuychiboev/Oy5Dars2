package com.najot.oy5dars2.controller;

import com.najot.oy5dars2.dto.BookRequestDTO;
import com.najot.oy5dars2.dto.BookResponseDTO;
import com.najot.oy5dars2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookController {
    private final BookService service;

    @GetMapping("/{id}")
    public BookResponseDTO getBook(@PathVariable("id") Integer id){
        return service.getBookById(id);
    }

    @GetMapping
    public List<BookResponseDTO> getBooks(){
        return service.getAllBook();
    }

    @PostMapping
    public BookResponseDTO createBook(@RequestBody BookRequestDTO requestDTO){
        return service.createBook(requestDTO);
    }


    @PutMapping("/{id}")
    public BookResponseDTO updateBook(@PathVariable Integer id, @RequestBody BookRequestDTO requestDTO){
        return service.updateBook(id, requestDTO);
    }



}
