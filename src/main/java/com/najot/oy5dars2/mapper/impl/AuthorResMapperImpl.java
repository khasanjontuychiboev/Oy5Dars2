package com.najot.oy5dars2.mapper.impl;

import com.najot.oy5dars2.dto.AuthorWithBooksDTO;
import com.najot.oy5dars2.entity.Author;
import com.najot.oy5dars2.mapper.AuthorResMapper;
import com.najot.oy5dars2.mapper.BookResMapper;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
@Builder
public class AuthorResMapperImpl implements AuthorResMapper {
    private final BookResMapper bookResMapper;
    @Override
    public AuthorWithBooksDTO toDTO(Author author) {
        return AuthorWithBooksDTO.builder()
                .id(author.getId())
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .books(bookResMapper.toDTOs(author.getBooks()))
                .build();
    }

    @Override
    public Author toEntity(AuthorWithBooksDTO authorWithBooksDTO) {
        return null;
    }

    @Override
    public List<AuthorWithBooksDTO> toDTOs(List<Author> authors) {
        return authors.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Author> toEntities(List<AuthorWithBooksDTO> authorWithBooksDTOS) {
        return null;
    }
}
