package com.bridgelabz;

public class MoodAnalyser {
    public static String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try{
            if (message.contains("Sad"))
                return "SAD";
            else if (message.contains("Happy"))
                return "HAPPY";

        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL , "Enter valid detail");
        }
        return "HAPPY";
    }

}
