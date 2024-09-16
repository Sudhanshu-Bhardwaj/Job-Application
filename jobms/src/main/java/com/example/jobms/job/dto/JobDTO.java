package com.example.jobms.job.dto;

import com.example.jobms.job.external.Company;
import com.example.jobms.job.external.Review;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JobDTO {

    private Long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;

    private Company company;
    private List<Review> review;
}
