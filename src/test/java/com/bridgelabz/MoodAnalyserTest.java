package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void caseInvalidNull()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

}
