package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private final ArrayList<Questions> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Questions> getQuestions(){
        return questions;
    }

    public int getNumCorrect(){
        return numCorrect;
    }
    public void addQuestions(Questions[] questionArray){
        Collections.addAll(questions,questionArray);
    }
    public void run(){
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for(Questions question : questions){
            System.out.println(question);

            ArrayList<Integer> userResponses= new ArrayList<>();
            int i = 0;
            while(i < question.getMaxResponses()){
                String userResponse;

                //Validate
                do{
                    System.out.println("Please enter a number: ");
                userResponse = input.nextLine();
                }while (question.isInvalid(userResponse));

                int userRespNum = Integer.parseInt(userResponse);
                if(userResponses.contains(userRespNum)){
                    System.out.println("you got the number one");
                } else if (!question.getChoiceMap().get(userRespNum).isCorrect()) {
                    System.out.println("Sorry,the correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                        if (choice.isCorrect()) {
                            System.out.println(choice.getContent());
                        }
                    }
                    break;
                }else{
                    System.out.println("Correct!");
                    userResponses.add(userRespNum);
                    if(i == question.getMaxResponses() - 1){
                        numCorrect++;
                    }
                    i++;
                }
            }
        }
        input.close();
    }

}
