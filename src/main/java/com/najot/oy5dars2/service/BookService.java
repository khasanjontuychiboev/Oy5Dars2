package com.najot.oy5dars2.service;

import com.najot.oy5dars2.dto.BookRequestDTO;
import com.najot.oy5dars2.dto.BookResponseDTO;
import com.najot.oy5dars2.entity.Book;

import java.util.List;

public interface BookService {
    BookResponseDTO getBookById(Integer id);

    List<BookResponseDTO> getAllBook();

    BookResponseDTO createBook(BookRequestDTO requestDTO);
    BookResponseDTO updateBook(Integer id, BookRequestDTO requestDTO);

    void deleteBook(Integer id);


}
