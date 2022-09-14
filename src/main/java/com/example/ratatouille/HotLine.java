package com.example.ratatouille;

public class HotLine {

    //in interface there are 3 buttons to choose the type of the String being written

    String S;

    //method Complain
    public String Complains (String S){

       if (S.contains("cost") || S.contains("price") || S.contains("expensive")){
           return "Thank you for notifying , but Great Quality requires extra fee ";
        }

        if (S.contains("taste") || S.contains("meal") || S.contains("raw")){
            return "Thank you for notifying , Next time we will try to improve the quality ";
        }

        if (S.contains("time") || S.contains("delay") || S.contains("late")){
            return "Thank you for notifying , Next time we will adjust the time more properly ";
        }

        return "Thank you for notifying , we wil put your complain in to our consideration";
    }


}
