package com.devgen.quiz.services;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions; //= new Question[10];
    private int current;
   

    public QuestionService(int size) {
    	questions = new Question[size];
    	questions[current] = new Question(1,"size of short data type","2","4","1","8","2");
    	current++;
    	questions[current] = new Question(2,"size of int data type","2","4","1","8","4");
    	current++;
    	questions[current] = new Question(3,"size of float data type","2","4","1","8","4");
    	current++;
    	questions[current] = new Question(4,"size of double data type","2","4","1","8","8");
    	current++;
    	questions[current] = new Question(5,"size of char data type","2","4","1","8","2");
    	current++;
    	
    }
    
    public String addQuestion(Question question) {
    	int length = questions.length;
    	questions[current] = question;
    	current++;
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
