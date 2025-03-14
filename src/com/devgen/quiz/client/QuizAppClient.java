package com.devgen.quiz.client;


import com.devgen.quiz.models.QuizResult;
import com.devgen.quiz.services.QuestionService;
import com.devgen.quiz.services.QuizService;

public class QuizAppClient {
	public static void main(String[] args) {
		
		
    QuestionService questionService = new QuestionService(5);
	QuizService quizService = new QuizService(questionService);
	
    quizService.playQuiz();
    QuizResult result =    quizService.getResult();
    
    
    System.out.println("total correct answers:" + result.getCorrectAnswers());
    System.out.println("total incorrect answers:" + result.getIncorrectAnswers());
    System.out.println(" percentage:" + result.getPercentage());
    System.out.println(" suggestion:" + result.getSuggestion());
    
	}
    
}
