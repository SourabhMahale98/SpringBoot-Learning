package com.sdm.QuizApp.dao;

import com.sdm.QuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao  extends JpaRepository<Question,Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM Questions q where q.category=:category ORDER BY RANDOM() limit :noQuestion",nativeQuery = true)
    List<Question> findRandomQuestionByCategory(String category, int noQuestion);
}
