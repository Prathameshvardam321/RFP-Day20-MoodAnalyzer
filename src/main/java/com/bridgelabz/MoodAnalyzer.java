package com.bridgelabz;


public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyzeMood(String message){
        if (message.contains("I am in Sad Mood")){
        return "SAD";
        }else if(message.contains("I am in Any Mood")){
            return "HAPPY";
        }
        else
            return null;
        }
    public String analyzeMoodWithConstructor(){
        if (message.contains("I am in Sad Mood")){
            return "SAD";
        }else if(message.contains("I am in Any Mood")){
            return "HAPPY";
        }
        else

            return null;
    }
}
