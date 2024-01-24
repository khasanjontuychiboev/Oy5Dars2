package com.najot.oy5dars2.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class BookRequestDTO {
    private String title;
    private String description;
}
