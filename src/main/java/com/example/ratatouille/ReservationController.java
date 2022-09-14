package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReservationController {

    public static Stage stage4;  // stage of the Menu
    public Spinner Table;
    public Spinner NumPeople;
    public Spinner ResTime;
    public TextField ResName;
    public Label Warning;
    public Button hotlinebutton;
    public Button menuButton;
    public TextField ID_Entered;


    Resevation rs1 = new Resevation();
    public static int ID;
    @FXML

    public void MenuClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MenuInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 906, 693);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage4 = stage;
       if (KidsController.stage3!=null)
        KidsController.stage3.close();
       if(Page1Controller.stage3!=null)
           Page1Controller.stage3.close();


    }

    public static Stage stage5 ; // stage of the HotLine
    public void HotLineClicked(ActionEvent actionEvent) throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("HotLineInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hot Line");
        stage.setScene(scene);
        stage.show();
        stage5 = stage;

        if(KidsController.stage3!=null)
            KidsController.stage3.close();
       if(Page1Controller.stage3!=null)
           Page1Controller.stage3.close();


    }


    public void ConfirmClicked(ActionEvent actionEvent) {
        //from database
        /*if(Table.get value is already booked)
        menue and hotline buttons are disabled and label warning appear
         */

        int key = Integer.parseInt(String.valueOf(Table.getValue()));
        if (rs1.choosing(key)){

            if (ID_Entered.getText()=="") {
                int SearchResult=0;

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project", "root", "Nowyouseeme2");
                    Statement statement = connection.createStatement();
                    statement.executeUpdate("INSERT INTO orders(firstName,Num_Of_Order)" + "VALUES(\""+ResName.getText()+"\",1)");
                    Statement statement1 = connection.createStatement();
                    ResultSet resultSet2 = statement1.executeQuery("SELECT MAX(Costumer_id) AS ID FROM orders");

                    if (resultSet2.next()){

                        ID_Entered.setText(String.valueOf(ID=(resultSet2.getInt("ID"))));

                    }

                } catch (Exception e) {
                    System.out.println(32);
                }
            }
            else {

                try{

                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project","root","Nowyouseeme2");
                    //Write in Table
                    Statement statement2 = connection.createStatement();
                    //update number of orders in database table
                    statement2.execute("UPDATE orders SET Num_Of_Order = Num_Of_Order+1  WHERE Costumer_id = "+ID_Entered.getText());
                    Statement statement3 = connection.createStatement();
                    ResultSet resultSet3 = statement3.executeQuery("SELECT firstName FROM orders WHERE Costumer_id = "+ID_Entered.getText());
                    ID = Integer.parseInt(ID_Entered.getText());

                    //setting the Costumer name inside the text field
                    if (resultSet3.next()){
                        ResName.setText(String.valueOf((resultSet3.getString(1))));
                    }
                }
                catch (Exception e){
                    System.out.println(33);
                }

            }



            Warning.setText("Your Reservation is Confirmed.");
            hotlinebutton.setDisable(false);
            menuButton.setDisable(false);
        }
        else {
            Warning.setText("Sorry! This Table is already Reserved!");
            hotlinebutton.setDisable(true);
            menuButton.setDisable(true);
        }


    }
}
