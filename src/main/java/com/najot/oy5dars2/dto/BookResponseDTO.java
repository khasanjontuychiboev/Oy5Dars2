package com.najot.oy5dars2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class BookResponseDTO {
    private Integer id;

    private String title;

    private AuthorResDTO authorResDTO;
}
