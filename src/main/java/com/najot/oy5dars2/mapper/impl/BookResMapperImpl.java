package com.najot.oy5dars2.mapper.impl;

import com.najot.oy5dars2.dto.AuthorResDTO;
import com.najot.oy5dars2.dto.BookResponseDTO;
import com.najot.oy5dars2.entity.Author;
import com.najot.oy5dars2.entity.Book;
import com.najot.oy5dars2.mapper.BookResMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookResMapperImpl implements BookResMapper {
    @Override
    public BookResponseDTO toDTO(Book book) {
        return BookResponseDTO.builder()
                .id(book.getId())
                .title(book.getTitle())
                .authorResDTO(
                        AuthorResDTO.builder()
                                .id(book.getAuthor().getId())
                                .firstName(book.getAuthor().getFirstName())
                                .lastName(book.getAuthor().getLastName()).build()
                )
                .build();
    }

    @Override
    public Book toEntity(BookResponseDTO bookResponseDTO) {
        return null;
    }

    @Override
    public List<BookResponseDTO> toDTOs(List<Book> books) {
        return books.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> toEntities(List<BookResponseDTO> bookResponseDTOS) {
        return null;
    }
}
