package com.devgen.quiz.services;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions = new Question[5];
   

    public QuestionService() {
    	questions[0] = new Question(1,"size of short data type","2","4","1","8","2");
    	questions[1] = new Question(2,"size of int data type","2","4","1","8","4");
    	questions[2] = new Question(3,"size of float data type","2","4","1","8","4");
    	questions[3] = new Question(4,"size of double data type","2","4","1","8","8");
    	questions[4] = new Question(5,"size of char data type","2","4","1","8","2");
    	
    }
    
    public String addQuestion(Question question) {
    	return "question added successfully";
    }
    
    public String updateQuestion(Question question) {
    	return "question update successfully";
    }
    
    public String deleteQuestion(int id) {
    	return "question delete successfully";
    }
    
    public Question[] getAllQuestion() {
    	return questions;
    }
    
   
}
