package com.najot.oy5dars2.dto;

import com.najot.oy5dars2.entity.Book;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorReqDTO {

    private Integer id;

    private String firstName;


    private String lastName;
}
