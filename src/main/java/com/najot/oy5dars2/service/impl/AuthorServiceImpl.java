package com.najot.oy5dars2.service.impl;

import com.najot.oy5dars2.dto.AuthorWithBooksDTO;
import com.najot.oy5dars2.mapper.AuthorResMapper;
import com.najot.oy5dars2.repository.AuthorRepository;
import com.najot.oy5dars2.service.AuthorService;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Builder
@Data
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorResMapper authorResMapper;

    @Override
    public AuthorWithBooksDTO getAuthorByIdWithBooks(Integer id) {
        return authorResMapper.toDTO(authorRepository.getReferenceById(id));
    }

    @Override
    public List<AuthorWithBooksDTO> getAuthorListWithBooks() {
        return authorResMapper.toDTOs(authorRepository.findAll());
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.deleteById(id);

    }
}
