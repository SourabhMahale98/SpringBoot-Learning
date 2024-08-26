package com.sdm.QuizApp.dao;

import com.sdm.QuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface QuizDao extends JpaRepository<Quiz,Integer> {
}
