package com.najot.oy5dars2.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthorResDTO {
    private Integer id;

    private String firstName;

    private String lastName;

}
