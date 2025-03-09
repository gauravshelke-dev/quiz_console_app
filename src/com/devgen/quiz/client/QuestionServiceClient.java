package com.devgen.quiz.client;

import com.devgen.quiz.models.Question;
import com.devgen.quiz.services.QuestionService;

public class QuestionServiceClient {
 public static void main(String[] args) {
	 
	QuestionService questionService = new QuestionService(100);
	
	Question question1 = new Question(6, "java born year", "1885", "1920","1995", "2005", "1995");
	questionService.addQuestion(question1);
	
	Question question2 = new Question(7, "java born year", "1885", "1920","1995", "2005", "1995");
	questionService.addQuestion(question2);
	
	Question question3 = new Question(8, "java born year", "1885", "1920","1995", "2005", "1995");
	questionService.addQuestion(question3);
	
	Question question4 = new Question(9, "java born year", "1885", "1920","1995", "2005", "1995");
	questionService.addQuestion(question4);
	
	Question question5 = new Question(10, "java born year", "1885", "1920","1995", "2005", "1995");
	questionService.addQuestion(question5);
}
}
