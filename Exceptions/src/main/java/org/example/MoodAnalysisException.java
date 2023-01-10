package org.example;

public class MoodAnalysisException extends Exception {
    public MoodAnalysisCustomException type;

    //Parametrized Constructor to pass message and handle exception
    public MoodAnalysisException(MoodAnalysisCustomException type, String message) {
        super(message);
        this.type = type;
    }

    public enum MoodAnalysisCustomException {
        NULL, EMPTY;   //Values entered
     }
}
