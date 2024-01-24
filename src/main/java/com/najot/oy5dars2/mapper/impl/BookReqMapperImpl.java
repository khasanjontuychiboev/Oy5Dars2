package com.najot.oy5dars2.mapper.impl;

import com.najot.oy5dars2.dto.BookRequestDTO;
import com.najot.oy5dars2.entity.Book;
import com.najot.oy5dars2.mapper.BookReqMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookReqMapperImpl implements BookReqMapper {

    @Override
    public BookRequestDTO toDTO(Book book) {
        return BookRequestDTO.builder()
                .title(book.getTitle())
                .description(book.getDescription())
                .build();
    }

    @Override
    public Book toEntity(BookRequestDTO requestDTO) {
        return Book.builder()
                .title(requestDTO.getTitle())
                .description(requestDTO.getDescription())
                .build();
    }

    @Override
    public List<BookRequestDTO> toDTOs(List<Book> books) {
        return books.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> toEntities(List<BookRequestDTO> bookRequestDTOS) {
        return bookRequestDTOS.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }
}
