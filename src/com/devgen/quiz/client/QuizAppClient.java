package com.devgen.quiz.client;


import com.devgen.quiz.services.QuestionService;
import com.devgen.quiz.services.QuizService;

public class QuizAppClient {
	public static void main(String[] args) {
		
		
    QuestionService questionService = new QuestionService();
	QuizService quizService = new QuizService(questionService);
    quizService.playQuiz();
    quizService.printFinalScore();
	}
    
}
