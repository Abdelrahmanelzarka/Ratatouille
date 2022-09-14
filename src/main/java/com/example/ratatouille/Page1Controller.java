package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Page1Controller {


    public ComboBox specialnights;
    public Label datesofevents;
    public ComboBox mealOftheDay;
    public Label datesOfMeals;
    public Label NightsDescription;
    public Label MealsDescription;

    public DatePicker dateChosen;

    Entertainment e1=new Entertainment();


    @FXML
    public void initialize()
    {
        specialnights.getItems().addAll("MASSAR EGBARI!!","Italian Theme Night","GUEST CHEF NIGHT","KARAOKE NIGHT",
                "COOKING CLASSES","COMEDY NIGHT"," ");

        mealOftheDay.getItems().addAll(" Glazed Salmon","Steak and Cauliflower Potatoes","Taco Salad Recipe!",
                "Quinoa Mushroom Risotto","Glazed Grilled Shrimp","Oriental Meals"," ");

    }



    public void onSelectedItemChanged(ActionEvent actionEvent) {
        //choosing the special night from the combo box and changing the date depending on that
        if(specialnights.getItems().indexOf(specialnights.getValue())==0) {
            datesofevents.setText("this show will be available from 1 to 5 this month.");
            NightsDescription.setText(e1.special_Nights(1));
        }
        else if(specialnights.getItems().indexOf(specialnights.getValue())==1) {
            datesofevents.setText("this show will be available from 6 to 10 this month.");
        NightsDescription.setText(e1.special_Nights(6));
    }
        else if(specialnights.getItems().indexOf(specialnights.getValue())==2){
            datesofevents.setText("this show will be available from 11 to 15 this month.");
            NightsDescription.setText(e1.special_Nights(11));
        }
        else if(specialnights.getItems().indexOf(specialnights.getValue())==3){
            datesofevents.setText("this show will be available from 16 to 20 this month.");
            NightsDescription.setText(e1.special_Nights(16));
        }
        else if(specialnights.getItems().indexOf(specialnights.getValue())==4){
            datesofevents.setText("this show will be available from 21 to 25 this month.");
            NightsDescription.setText(e1.special_Nights(21));
        }
        else if(specialnights.getItems().indexOf(specialnights.getValue())==5){
            datesofevents.setText("this show will be available from 26 to 31 this month.");
            NightsDescription.setText(e1.special_Nights(26));
        }

    }

    public void onSelectedItemChanged2(ActionEvent actionEvent) {
           //choosing the meal from the combo box and changing the date depending on that
        if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==0){
            datesOfMeals.setText("this meal will be available from 1 to 5 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(1));
        }
        else if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==1){
            datesOfMeals.setText("this meal will be available from 6 to 10 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(6));
        }
        else if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==2){
            datesOfMeals.setText("this meal will be available from 11 to 15 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(11));
        }
        else if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==3){
            datesOfMeals.setText("this meal will be available from 16 to 20 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(16));
        }
        else if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==4){
            datesOfMeals.setText("this meal will be available from 21 to 25 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(21));
        }
        else if(mealOftheDay.getItems().indexOf(mealOftheDay.getValue())==5){
            datesOfMeals.setText("this meal will be available from 26 to 31 this month.");
            MealsDescription.setText(e1.Meal_of_The_Day(26));
        }

    }

    int date;
    public void onDateclicked(ActionEvent actionEvent) {


            //setting the value of the combobox of the special night depanding on the date


                date=Integer.parseInt(String.valueOf(dateChosen.getValue()).substring(8,10));

            
            if ((date >= 1) && (date <= 5)) {
                specialnights.setValue(specialnights.getItems().get(0));
            }
            if ((date >= 6) && (date <= 10)) {
                specialnights.setValue(specialnights.getItems().get(1));
            }
            if ((date >= 11) && (date <= 15)) {
                specialnights.setValue(specialnights.getItems().get(2));
            }
            if ((date >= 16) && (date <= 20)) {
                specialnights.setValue(specialnights.getItems().get(3));
            }
            if ((date >= 21) && (date <= 25)) {
                specialnights.setValue(specialnights.getItems().get(4));
            }
            if ((date >= 26) && (date <= 31)) {
                specialnights.setValue(specialnights.getItems().get(5));
            }






            //setting the value of the combobox of the meal depanding on the date

            if ((date >= 1) && (date <= 5)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(0));
            }
            if ((date >= 6) && (date <= 10)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(1));
            }
            if ((date >= 11) && (date <= 15)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(2));
            }
            if ((date >= 16) && (date <= 20)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(3));
            }
            if ((date >= 21) && (date <= 25)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(4));
            }
            if ((date >= 26) && (date <= 31)) {
                mealOftheDay.setValue(mealOftheDay.getItems().get(5));
            }




    }
       public static Stage stage2 ; // stage of Kids/Pets
    public void onkidsPetsClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("kidsInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("kids/Pets Corner");
        stage.setScene(scene);
        stage.show();
        stage2 = stage;
        Main.s.close();

    }

     public static Stage stage3; // stage of Reservation
    public void ReservationButton(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReservationInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Reservation");
        stage.setScene(scene);
        stage.show();
        stage3 = stage;
        Main.s.close();

    }
}