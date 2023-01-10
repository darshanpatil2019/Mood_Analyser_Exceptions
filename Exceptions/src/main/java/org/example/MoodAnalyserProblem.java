package org.example;

public class MoodAnalyserProblem {
   //Declaring Variables
    String message;
    String mood;

    //Default Constructor
    public MoodAnalyserProblem(){
        message="";

    }
    //Parameterized Constructor to pass message as parameter
    public MoodAnalyserProblem(String message) {
        this.message = message;
    }

    //Method to Analyse the mood
    public String analyseMood() {
        if(message.contains("Happy"))
        {
            mood = "Happy";
        } else if(message.contains("Sad"))
        {
            mood= "Sad";
        }
        return mood;
    }

    public static void main (String[] args){
        System.out.println("Welcome to Mood Analyzer Problem");
    }
}