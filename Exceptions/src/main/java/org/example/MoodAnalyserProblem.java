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

    //MAIN METHOD AND THROW CUSTOM EXCEPTION
    public static void main(String[] args) throws MoodAnalysisException {
        System.out.println("Welcome to Mood Analyzer Problem");
    }

    //method to throw custom exceptions
    public String analyseMood(Object o) throws MoodAnalysisException {
        try {
            if (message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.EMPTY, "Please Enter Proper Mood");
            }
            if (message.contains("Happy")) {
                return "Happy";
            } else {
                return "Sad";
            }
        } catch (NullPointerException e) {
            //return "happy";
            throw new MoodAnalysisException(MoodAnalysisException.MoodAnalysisCustomException.NULL, "Please Enter Proper Mood");
        }
    }
}