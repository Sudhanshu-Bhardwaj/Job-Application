package com.example.jobms.job.mapper;

import com.example.jobms.job.Job;
import com.example.jobms.job.dto.JobDTO;
import com.example.jobms.job.external.Company;
import com.example.jobms.job.external.Review;

import java.util.List;

public class JobMapper {
    public static JobDTO mapToJobWithCompanyDto(Job job, Company company, List<Review> reviews) {
        JobDTO jobWithCompanyDTO = new JobDTO();
        jobWithCompanyDTO.setId(job.getId());
        jobWithCompanyDTO.setTitle(job.getTitle());
        jobWithCompanyDTO.setDescription(job.getDescription());
        jobWithCompanyDTO.setLocation(job.getLocation());
        jobWithCompanyDTO.setMaxSalary(job.getMaxSalary());
        jobWithCompanyDTO.setMinSalary(job.getMinSalary());
        jobWithCompanyDTO.setCompany(company);
        jobWithCompanyDTO.setReview(reviews);
        return jobWithCompanyDTO;
    }
}
