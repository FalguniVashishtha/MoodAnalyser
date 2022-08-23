package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    ExceptionType type;

    //To inform user whether the mood entered is empty or null
    enum ExceptionType {
        ENTERED_NULL
    }

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
