package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {
    @Test
    public void analyzeSadMessageTest(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("I am in Sad Mood"));
    }
    @Test
    public void analyzeHappyMessageTest(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood("I am in Any Mood"));
    }
    @Test
    public void analyzeHappyMessageTestWithConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMoodWithConstructor());
    }
    @Test
    public void analyzeSadMessageTestWithConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMoodWithConstructor());
    }

}
