package com.devgen.quiz.client;

import com.devgen.quiz.services.QuestionService;

public class QuizAppClient {
	public static void main(String[] args) {
    
    QuestionService questionService = new QuestionService();
    questionService.playQuiz();
    questionService.printFinalScore();
	}
    
}
