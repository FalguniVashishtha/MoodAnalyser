package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void caseSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am In Sad mood.");
        System.out.println(result);
        Assertions.assertEquals("Sad" , result);
    }
    @Test
    public void caseHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in a Happy Mood");
        System.out.println(result);
        Assertions.assertEquals("Happy" , result);
    }
}
