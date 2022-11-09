package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyzerTest {
     @Test
    public void analyzeSadMessageTestWithConstructor(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
        String mood = moodAnalyzer.analyzeMoodWithConstructor();
            Assert.assertEquals("SAD", mood);
        }catch (Exception e){
            System.out.println("Exception occurred in program : "+e);
        }
    }
    @Test
    public void analyzeTestMessageWithHandlingException(){
       try{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.validate("");
        System.out.println(mood);
    } catch (MoodAnalysisException e){
            System.out.println("Exception occurred is : "+e);
        }
     }
}
