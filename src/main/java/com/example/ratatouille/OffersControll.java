package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class OffersControll {

    public Label Pricce;
    public Label OfferPrice;
    public Label minmumCharge;
    public Button Recipt_button;
    public Label minmumForOffers;
    public Label OfferSign;

    Offers o1 = new Offers();

    @FXML
    public void initialize()
    {
        Pricce.setText(String.valueOf(MenuController.Order_Price));

        if(!o1.checkMin(MenuController.Order_Price))
        {
            Recipt_button.setDisable(true);
            minmumCharge.setText("Sorry your order is below the minimum charge");
        }
        if(MenuController.Order_Price>=o1.minDiscount)
        {
            OfferPrice.setText(String.valueOf(o1.Price(MenuController.Order_Price*1.0)));
            minmumForOffers.setText("Congratulations!! your order Has a discount and your new price is:");
            OfferSign.setText("$");
        }

    }
public static Stage stage4; //stage for menu
    public void onMenuClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MenuInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 906, 693);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage4 = stage;
        MenuController.stage6.close();
    }

    public static Stage stage7;
    public void OnReciptClicked(ActionEvent actionEvent) throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReciptInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 780, 704);
        stage.setTitle("Receipt");
        stage.setScene(scene);
        stage.show();
        stage7=stage;
        MenuController.stage6.close();

    }
}
