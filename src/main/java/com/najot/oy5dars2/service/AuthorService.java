package com.najot.oy5dars2.service;

import com.najot.oy5dars2.dto.AuthorWithBooksDTO;

import java.util.List;

public interface AuthorService {
    AuthorWithBooksDTO getAuthorByIdWithBooks(Integer id);
    List<AuthorWithBooksDTO> getAuthorListWithBooks();

    void deleteAuthor(Integer id);

}
