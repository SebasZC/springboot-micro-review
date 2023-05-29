package com.ivanfranchin.bookreviewapi.mapper;

import com.ivanfranchin.bookreviewapi.graphql.input.ReviewInput;
import com.ivanfranchin.bookreviewapi.model.Review;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T16:31:32-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public Review toReview(ReviewInput reviewInput) {
        if ( reviewInput == null ) {
            return null;
        }

        String reviewer = null;
        String comment = null;
        Integer rating = null;

        reviewer = reviewInput.reviewer();
        comment = reviewInput.comment();
        rating = reviewInput.rating();

        String createdAt = null;

        Review review = new Review( reviewer, comment, rating, createdAt );

        return review;
    }
}
