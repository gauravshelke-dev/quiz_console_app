package com.devgen.quiz.services;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions; //= new Question[10];
    private int current;
   

    public QuestionService(int size) {
    	
    	questions = new Question[size];
    	initializeDefaultQuestions(); 
  }
    
	private void initializeDefaultQuestions() {
		
		questions[current++] = new Question(1, "Size of short data type", new String[] {"2", "4", "1", "8"}, 1);
    	
    	questions[current++] = new Question(2, "Is Java Object Oriented Lang ?", new String[] {"true", "false"}, 1);
    	
    	questions[current++] = new Question(3, "Size of float data type", new String[] {"2", "4", "1", "8"}, 2);
    	
    	questions[current++] = new Question(4, "How do you create a variable with the numeric value 5?", new String[] {"int x=5;", "float f=4.5;", "num x=5", "x=5"}, 1);
    	    	
    	questions[current++] = new Question(5, "Size of char data type", new String[] {"2", "4"}, 1);
	}
    
    public String addQuestion(Question question) {
    	//int length = questions.length;
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
