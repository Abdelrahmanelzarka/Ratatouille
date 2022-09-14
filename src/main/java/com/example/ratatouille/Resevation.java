package com.example.ratatouille;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Resevation extends Entertainment {





    public Boolean choosing (int N) // check if the table is available , N table Number
    {

        // flag is returned to the interface to show if the booking process is successfully done

        int SearchResult =0 ;
        try{
                 System.out.println(N);

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_project","root","Nowyouseeme2");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Check_Table FROM table_availability WHERE Table_Number =  "+N);
            if (resultSet.next()){
                SearchResult = resultSet.getInt("Check_Table");

            }

            System.out.println(SearchResult);
            if (SearchResult == 1)
            { return false; }
            else
            {
                //Write in Table
                Statement statement2 = connection.createStatement();
                statement2.execute("UPDATE table_availability SET Check_Table = 1  WHERE Table_Number = "+N);

                return true;

            }

        }
        catch (Exception e){
             System.out.println(SearchResult);
            return false;
        }




    }




    public int OpenTime(){

        return super.OpenTime() - 4;

    }


}
