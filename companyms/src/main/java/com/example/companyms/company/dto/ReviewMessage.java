package com.example.companyms.company.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewMessage {

    private Long id;
    private String title;
    private String description;
    private Double rating;
    private Long companyId;
}
