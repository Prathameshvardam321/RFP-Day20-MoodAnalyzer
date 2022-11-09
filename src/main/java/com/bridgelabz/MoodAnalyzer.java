package com.bridgelabz;

class MoodAnalysisException extends Exception{
    public MoodAnalysisException(String message){
        super(message);
    }
}
public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(){

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyzeMood(String message){
        try{
            if (message.contains("I am in Sad Mood")){
                return "SAD";
            }
            if(message.contains("I am in Any Mood")){
                return "HAPPY";
            }

        }catch (Exception e){
            return "HAPPY";
        }
        return "";
        }
    public String analyzeMoodWithConstructor(){

        if (message.contains("I am in Sad Mood")){
            return "SAD";
        }
        if(message.contains("I am in Any Mood")){
            return "HAPPY";
        }
        return "";
    }
    public String validate(String message) throws MoodAnalysisException{
        try {
            if (message.contains("I am in Sad Mood")) {
                return "SAD";
            }
            if (message.contains("I am in Any Mood")) {
                return "HAPPY";
            }

            return "";

        }catch (Exception e){
            throw new MoodAnalysisException("Entered null value or empty string");
        }
    }
}
