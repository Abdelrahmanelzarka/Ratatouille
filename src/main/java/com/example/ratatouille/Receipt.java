package com.example.ratatouille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Receipt extends Offers{

    public static final int Fix = 20;
   public static final Double Tax = 0.12 ;

    //method to Calculate Price
    public Double Price (Double total ){

        int numOrdering=0;
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project","root","Nowyouseeme2");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Num_Of_Order FROM orders WHERE Costumer_id ="+ReservationController.ID);
            if (resultSet.next()){
                numOrdering= resultSet.getInt("Num_Of_Order");
            }
        }

        catch (Exception e){
        }
        if (numOrdering%10 == 0){
                return 0.0;
            }
        return total + total*Tax + Fix;
    }

}



