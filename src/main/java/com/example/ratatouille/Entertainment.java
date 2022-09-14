package com.example.ratatouille;

import javafx.fxml.FXML;

import java.sql.*;

public class Entertainment implements IEntertainment {

    public int N;
    public boolean Fpets;



    //Overriding OpenTime in IEntertainment
    public int OpenTime(){
        return 18;
    }


    //Method1
    public String special_Nights(int N){

        if (N>=1 && N <= 5){
           return "Today we are having a \"Live Music Band\" \n MASSAR EGBARI!!";
        }

        if (N>5 && N<= 10){
            return "Today we are having an \"Italian Theme Night\" \n STAY TUNED!";
        }

        if (N>10 && N<= 15){
            return "Today we are having: \"GUEST CHEF NIGHT\" \n GET READY TO FRESHEN THINGS UP! ";
        }

        if (N>15 && N<= 20){
            return "Today we are having : \"KARAOKE NIGHT\" \n THE WINNER WILL HAVE A FREE SPECIAL MEAL!";
        }

        if (N>20 && N <= 25){
            return "Today we are having :\"COOKING CLASSES\" \n DON'T MISS IT OUT! ";
        }

        if (N >25 && N<=31){
            return "Today we are having : \"COMEDY NIGHT\" \n filled with laughter and joyful vibes.";
        }
        return " ";

    }

    //Method2
    public String Meal_of_The_Day(int N){

        if (N>=1 && N <=5 ){
            return "Miso Glazed Salmon Recipe with Snap Peas!";
        }

        if (N>5 && N<= 10){
            return "Steak and Cauliflower Potatoes with Sauteed Spinach Recipe!";
        }

        if (N>10 && N<= 15){
            return "Quick and Easy Taco Salad Recipe! ";
        }

        if (N>15 && N<= 20){
            return "Quinoa Mushroom Risotto Recipe ";
        }

        if (N>20 && N <= 25){
            return "Glazed Grilled Shrimp Recipe! ";
        }

        if (N >25 && N<=31){
            return "Oriental delicious Meals! ";
        }
        return "Invalid Month date! Please enter a correct one! ";

    }

    //Method pets corner
    public boolean Pets_Corner(){
        //check DataBase if we reached the maximum limit per day
        //if yes return false
        //Method that returns the counter number of pets per day in Data Base

        int SearchResult=0;
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project","root","Nowyouseeme2");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT counter FROM petsperday ");
            if (resultSet.next()){
                SearchResult = resultSet.getInt("counter");
            }

            SearchResult = SearchResult +1 ;
            if (SearchResult > 10)
            {return false;}



            //Write in Table

            Statement statement2 = connection.createStatement();
            statement2.execute("UPDATE petsperday SET counter = counter+1  WHERE counter_Box = 1");


        }
        catch (Exception e){
           // System.out.println(0);
        }

        return Fpets=true;
    }



}
