package com.example.student_database.Service;

import com.example.student_database.Entity.Review;
import com.example.student_database.Repository.ReviewRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ReviewService
{
    @Autowired
    private ReviewRespository reviewRepository;

    public Review findById(int id) {
        return reviewRepository.findById(id).get();
    }

    @Transactional
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Transactional
    public void remove(Review review) {
        reviewRepository.delete(review);
    }
}
