package com.devgen.quiz.services;

import java.util.Iterator;
import java.util.Scanner;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions = new Question[5];
    private String[] userSelectedAnswers = new String[5];

    public QuestionService() {
    	questions[0] = new Question(1,"size of short data type","2","4","1","8","2");
    	questions[1] = new Question(2,"size of int data type","2","4","1","8","4");
    	questions[2] = new Question(3,"size of float data type","2","4","1","8","4");
    	questions[3] = new Question(4,"size of double data type","2","4","1","8","8");
    	questions[4] = new Question(5,"size of char data type","2","4","1","8","2");
    	
    }
    
    public void playQuiz() {
        for (int i = 0; i < questions.length; i++) {
            
            System.out.println("Question: "+questions[i].getId());
            System.out.println(questions[i].getQuestion());
            
            System.out.println(questions[i].getOption1());
            System.out.println(questions[i].getOption2());
            System.out.println(questions[i].getOption3());
            System.out.println(questions[i].getOption4());
            
            Scanner scan = new Scanner(System.in);
            userSelectedAnswers[i] = scan.next();
          }
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
