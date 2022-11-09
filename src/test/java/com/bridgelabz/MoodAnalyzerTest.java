package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {
     @Test
    public void analyzeSadMessageTestWithConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
        String mood = moodAnalyzer.analyzeMoodWithConstructor();
            Assert.assertEquals("SAD", mood);
        }catch (Exception e){
            System.out.println("Exception occurred in program : "+e);
        }
    }
    @Test
    public void analyzeTestMessageWithHandlingException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
       String mood = moodAnalyzer.analyzeMood(null);
        System.out.println(mood);
    }

}
