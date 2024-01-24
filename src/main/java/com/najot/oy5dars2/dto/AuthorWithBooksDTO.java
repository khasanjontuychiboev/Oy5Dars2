package com.najot.oy5dars2.dto;

import com.najot.oy5dars2.entity.Book;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AuthorWithBooksDTO {
    private Integer id;

    private String firstName;


    private String lastName;

    private List<BookResponseDTO> books;
}
