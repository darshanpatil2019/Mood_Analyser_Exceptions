package org.example;

public class MoodAnalyserProblem {
    //Declaring Variables
    String message;
    String mood;

    //Default Constructor
    public MoodAnalyserProblem() {
        message = "";

    }

    //Parameterized Constructor to pass message as parameter
    public MoodAnalyserProblem(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Problem");
    }

    //Method to Analyse the mood
    public String analyzeMood() {
        {
            try {
                if (message.contains("Happy")) {
                    return "Happy";
                } else {
                    return "Sad";
                }
            } catch (NullPointerException e) {
                return "Happy";
            }
        }
    }
}