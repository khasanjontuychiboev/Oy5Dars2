package com.najot.oy5dars2.controller;

import com.najot.oy5dars2.dto.AuthorWithBooksDTO;
import com.najot.oy5dars2.service.AuthorService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
@Data
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping
    public List<AuthorWithBooksDTO> getAuthors(){
        return authorService.getAuthorListWithBooks();
    }

    @GetMapping("/{id}")
    public AuthorWithBooksDTO getAuthor(@PathVariable Integer id){
        return authorService.getAuthorByIdWithBooks(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id){
        authorService.deleteAuthor(id);
    }
}
