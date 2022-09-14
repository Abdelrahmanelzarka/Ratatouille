package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ReviewController {
   // public ScrollBar rate;
    public ChoiceBox GoodChoice;
    public ChoiceBox BadChoice;
    public Label Message;
    public Label MessegeGoodChoice;
    public Label MessageBadChoice;
    public ScrollBar rate;


    Review rv1= Review.getInstance();


    @FXML
    public void initialize()
    {

       String[] suboreder = ReceiptControl.order.split("x");
       for(int i=0 ; i<rv1.orders(ReceiptControl.order) ; i++)
       {
           suboreder[i]=rv1.orders(i).substring(0,suboreder[i].length()-1);
       }
       GoodChoice.getItems().addAll(suboreder);

        BadChoice.getItems().addAll(suboreder);

        GoodChoice.setValue(suboreder[0]);
        BadChoice.setValue(suboreder[0]);

    }

    public void OnExitClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ThankYou.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 470, 600);
        stage.setTitle("ThankYou");
        stage.setScene(scene);
        stage.show();
        ReceiptControl.stage8.close();
    }


    public void OnRateChanged(MouseEvent mouseEvent) {
        Message.setText(rv1.message(rate.getValue()));
        if(GoodChoice.getValue()!=GoodChoice.getItems().get(0))
        {
            MessegeGoodChoice.setText("It's our pleasure");
        }
        if(BadChoice.getValue()!=BadChoice.getItems().get(0))
        {
            MessageBadChoice.setText("We will work on that");
        }

    }
}
