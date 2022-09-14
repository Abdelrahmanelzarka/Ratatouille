package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class HotLineController {
    public TextArea UserMessage;
    public Label ourReply;
    public Label OurReply2;

    HotLine H1 = new HotLine();
    public void ComplainsClicked(ActionEvent actionEvent) {
        ourReply.setText(H1.Complains(UserMessage.getText()).substring(0,25));
        OurReply2.setText(H1.Complains(UserMessage.getText()).substring(25));

    }

    public void InquiresClicked(ActionEvent actionEvent) {
         // static reply
        ourReply.setText("Thank You for contacting Us,");
        OurReply2.setText("We will Reply as soon as possible. ");
    }

    public void NotesClicked(ActionEvent actionEvent) {

        // static reply
        ourReply.setText("Thank You for contacting Us,");
        OurReply2.setText("Your Notes will be taken into Consideration.");
    }

    public static Stage stage4;  // stage of the Menu
    public void OnMenuClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MenuInterface.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 906, 693);
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage4 = stage;
        ReservationController.stage5.close();


    }
}
