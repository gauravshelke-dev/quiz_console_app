package com.devgen.quiz.services;

import java.util.Scanner;

import com.devgen.quiz.models.Question;

public class QuizService {
	
	 private String[] userSelectedAnswers = new String[5];
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
	            
	            System.out.println(questions[i].getOption1());
	            System.out.println(questions[i].getOption2());
	            System.out.println(questions[i].getOption3());
	            System.out.println(questions[i].getOption4());
	            
	           
	            userSelectedAnswers[i] = scan.next();
	          }
	        scan.close();
	    }
	    
	    public void printFinalScore() {
	    	int correctAnswers = 0;
	        for (int i = 0; i < userSelectedAnswers.length; i++) {
				if (questions[i].getAnswer().equals(userSelectedAnswers[i])) {
					correctAnswers++;
				}
			}
	        int incorrectAnswers = questions.length - correctAnswers;
	       
	        double percentage = ((double) correctAnswers / questions.length) * 100;
	        System.out.println("correct answers:"+correctAnswers);
	        System.out.println("incorrect answers:"+incorrectAnswers);
	        System.out.println("percentage:"+percentage);
	    }
}
