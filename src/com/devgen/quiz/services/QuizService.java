package com.devgen.quiz.services;

import java.util.Scanner;


import com.devgen.quiz.models.Question;
import com.devgen.quiz.models.QuizResult;

public class QuizService {
	
	    private int[] userSelectedAnswers = new int[5];
		private Question[] questions;	
		private QuestionService questionService; 
	 
	 public QuizService(QuestionService questionService) {
		 this.questionService = questionService;
		 questions = questionService.getAllQuestion();
	 }
	 
	 public void playQuiz() {
		 
	    Scanner scan = new Scanner(System.in);
	    	 
	        for (int i = 0; i < questions.length; i++) {
	            
	            System.out.println("Question: "+questions[i].getId());
	            System.out.println(questions[i].getQuestion());
	            
	            for(String option : questions[i].getOptions()) {
	         		System.out.println(option);                		
	         	}
	            
	           
	            userSelectedAnswers[i] = scan.nextInt();
	          }
	        scan.close();
	    }
	    
	    public QuizResult getResult() {
	    	int correctAnswers = 0;
	        for (int i = 0; i < userSelectedAnswers.length; i++) {
				if (questions[i].getAnswer() == userSelectedAnswers[i]) {
					correctAnswers++;
				}
			}
	        int incorrectAnswers = questions.length - correctAnswers;
	       
	        double percentage = ((double) correctAnswers / questions.length) * 100;
	        
	    	String suggestion = getSuggestion(percentage);
	    	
	    	
	        
	        
	        QuizResult quizResult = new QuizResult(correctAnswers, incorrectAnswers, percentage, suggestion);
	        
	         return quizResult;
	    }
	    
		private String getSuggestion(double percentage) {
			String suggestion = "";
	    	
	    	if(percentage >= 0 && percentage <= 30) {
	    		suggestion = "You must study much harder";
	    	}else if(percentage >= 31 && percentage <= 60) {
	    		suggestion = "You are studying good. Need some more study";
	    	}else if(percentage >= 61 && percentage <= 90) {
	    		suggestion = "You are becoming topper and just bit of extra effors little required";
	    	}else {
	    		suggestion = "You are very good at concepts and being into top list.";
	    	}
			return suggestion;
		}
}
