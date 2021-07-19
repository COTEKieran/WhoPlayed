package com.example.whoplayed;

public class Questions {

    public int mQuestions[] = {
            R.drawable.cesc_fabregas,
            R.drawable.cristiano_ronaldo
    };

    private String mChoices[][] = {
            {"Olivier Giroud","Cesc Fabregas","Ashley Cole","Thierry Henry"},
            {"Lionel Messi", "Bruno Fernandes", "Cristiano Ronaldo", "David Beckham"}
    };

    private String mCorrectAnswers[] = {"Cesc Fabregas","Cristiano Ronaldo"};

    public int getQuestion(int a){
        int question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
