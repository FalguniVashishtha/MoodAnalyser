package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void caseSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("SAD", result);
    }

}
