package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;

public class KidsController {

    public TextField PetArrival;
    public int Counter=0; // to check the number of chosen activities

    public int lastnumber=0;
    public CheckBox Magnetic;
    public CheckBox Puzzlee;
    public CheckBox Facee;
    public CheckBox Bakee;
    public CheckBox Makee;
    public CheckBox cartoonn;
    public CheckBox Writee;
    public TextField KidsNumber;



    int []clicked={0,0,0,0,0,0,0}; // to check if it's even 'sub' clicked or odd clicked 'add'
    public  Label PetConfirmationLabel;
    public Button SetButton;
    public Label priceKids;
    public Label Warning;

    public static int flag =0;
   DecimalFormat df=new DecimalFormat(".##");
    Entertainment e2 =new Entertainment();
    public static Kids_Area K1=new Kids_Area();
    @FXML
    public void initialize()
    {


    }


    public void PetsConfirmation(ActionEvent actionEvent) {
        try {
            if(Integer.parseInt(String.valueOf(PetArrival.getText()))<e2.OpenTime() || Integer.parseInt(String.valueOf(PetArrival.getText()))>24)
                throw new Exception();
            else {
                //depend on data base
                if(e2.Pets_Corner())
                {
                    PetConfirmationLabel.setText("Confirmed");
                    flag=1;
                }
                else
                {
                    PetConfirmationLabel.setText("Sorry, Maximum capacity of the day has been reached");
                }

            }
        }
        catch (Exception e)
        {
            PetConfirmationLabel.setText("Invalid option");
        }
    }
    public static Stage stage3;  // stage of the Reservation
    public void ReservationButton(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReservationInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 600);
        stage.setTitle("Reservation");
        stage.setScene(scene);
        stage.show();
        stage3 = stage;
        Page1Controller.stage2.close();

    }


    public void Story(ActionEvent actionEvent) {


        clicked[0]++;

        if(clicked[0]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(0)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(0)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }





    }

    public void Ice_Cream(ActionEvent actionEvent) {
        clicked[1]++;

        if(clicked[1]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(1)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(1)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }

    }

    public void Cartoon(ActionEvent actionEvent) {
        clicked[2]++;

        if(clicked[2]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(2)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(2)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }
    }


    public void Cup_cakes(ActionEvent actionEvent) {
        clicked[3]++;

        if(clicked[3]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(3)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(3)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }
    }

    public void Painting(ActionEvent actionEvent) {
        clicked[4]++;

        if(clicked[4]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(4)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(4)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }
    }

    public void Puzzle(ActionEvent actionEvent) {
        clicked[5]++;

        if(clicked[5]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(5)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(5)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }

        }
    }

    public void tiles(ActionEvent actionEvent) {
        clicked[6]++;

        if(clicked[6]%2==1) {
            Counter++;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids=(K1.Price_Kids+K1.ActivityPrices(6)))));
            if(Counter==3) {
                Warning.setText("Sorry! Maximum number of activities to be chosen is only 3");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(true);
                        else if (i == 1)
                            Makee.setDisable(true);
                        else if (i == 2)
                            cartoonn.setDisable(true);
                        if (i == 3)
                            Bakee.setDisable(true);
                        else if (i == 4)
                            Facee.setDisable(true);
                        else if (i == 5)
                            Puzzlee.setDisable(true);
                        else if (i == 6)
                            Magnetic.setDisable(true);


                    }
                }
            }
        }
        else {
            Counter--;

            priceKids.setText(String.valueOf(df.format(K1.Price_Kids = (K1.Price_Kids - K1.ActivityPrices(6)))));
            if (Counter != 3) {
                Warning.setText("");
                for (int i = 0; i < 7; i++) {
                    if (clicked[i] % 2 == 0) {
                        if (i == 0)
                            Writee.setDisable(false);
                        else if (i == 1)
                            Makee.setDisable(false);
                        else if (i == 2)
                            cartoonn.setDisable(false);
                        if (i == 3)
                            Bakee.setDisable(false);
                        else if (i == 4)
                            Facee.setDisable(false);
                        else if (i == 5)
                            Puzzlee.setDisable(false);
                        else if (i == 6)
                            Magnetic.setDisable(false);


                    }
                }
            }


        }



    }

    public void NumOfKids(ActionEvent actionEvent) {
        try {



            priceKids.setText(String.valueOf(df.format(K1.Price_Kids+=K1.NumOfKids(Integer.parseInt(KidsNumber.getText())-lastnumber))));
            lastnumber=Integer.parseInt(KidsNumber.getText());
        }
        catch (Exception e)
        {
            priceKids.setText("Invalid Option");
        }
    }
}
