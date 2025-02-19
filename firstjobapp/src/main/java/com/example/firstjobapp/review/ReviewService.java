package com.example.firstjobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId, long reviewId);
    boolean updateReview(Long companyId, Long reviewId, Review updatedReview);

    boolean deleteReview(Long companyId, Long reviewId);
}
