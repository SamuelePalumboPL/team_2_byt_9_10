package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewTest {

    String text = "text";
    int score = 4;
    boolean status = true;

    Review review = new Review(text, score, status);

    @Test
    void TestConstructor(){
        assertEquals(review.getText(), text);
        assertEquals(review.getScore(), score);
        assertEquals(review.getStatus(), status);
    }

    @Test
    void setText() {
        String newText = "text2";
        review.setText(newText);
        assertEquals(review.getText(), newText);
    }

    @Test
    void setScore() {
        int newScore = 5;
        review.setScore(newScore);
        assertEquals(review.getScore(), newScore);
    }

    @Test
    void setStatus() {
        boolean newStatus = false;
        review.setStatus(newStatus);
        assertEquals(review.getStatus(), newStatus);
    }
}