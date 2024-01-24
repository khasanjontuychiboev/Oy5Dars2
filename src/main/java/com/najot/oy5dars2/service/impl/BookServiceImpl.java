package com.najot.oy5dars2.service.impl;

import com.najot.oy5dars2.dto.BookRequestDTO;
import com.najot.oy5dars2.dto.BookResponseDTO;
import com.najot.oy5dars2.entity.Book;
import com.najot.oy5dars2.mapper.BookReqMapper;
import com.najot.oy5dars2.mapper.BookResMapper;
import com.najot.oy5dars2.repository.BookRepository;
import com.najot.oy5dars2.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookResMapper resMapper;
    private final BookReqMapper reqMapper;
    private final BookRepository repository;

    @Override
    public BookResponseDTO getBookById(Integer id) {
        return resMapper
                .toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<BookResponseDTO> getAllBook() {
        return resMapper
                .toDTOs(repository.findAll());
    }

    @Override
    public BookResponseDTO createBook(BookRequestDTO requestDTO) {
        return resMapper
                .toDTO(repository.save(reqMapper.toEntity(requestDTO)));
    }

    @Override
    public BookResponseDTO updateBook(Integer id, BookRequestDTO requestDTO) {

        Book book = repository.getReferenceById(id);
        book.setTitle(requestDTO.getTitle());
        book.setDescription(requestDTO.getDescription());

        return resMapper
                .toDTO(repository.save(book));
    }

    @Override
    public void deleteBook(Integer id) {
            repository.deleteById(id);
    }
}
