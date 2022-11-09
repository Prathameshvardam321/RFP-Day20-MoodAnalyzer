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
        public String analyzeMoodE(String message){
            if (message.contains("I am in Sad Mood")){
                return "SAD";
            }
            if(message.contains("I am in Any Mood")){
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
    public void exceptionThrowing(String message) throws MoodAnalysisException{
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
            moodAnalyzer.analyzeMood(message);
        }catch (Exception e){
            throw new MoodAnalysisException("Entered value is empty or null.");
        }
    }
}
