package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {


    public static Menu m1= new Menu();

    public  Label Tprice;
    public static int Order_Price;
    public ListView list;
    public static String s1="";

    @FXML
    public void initialize()
    {
        m1.initialize();
        Order_Price=0;
        s1="";

    }

    //beverage buttons
    public void MochaAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(0));
        if(m1.checkb(0)<=1)
           s1=s1+"x"+m1.beverage[0];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(0)));
        
    }

    public void EspressoAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(1));
        if(m1.checkb(1)<=1)
            s1=s1+"x"+m1.beverage[1];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(1)));

    }

    public void TeaAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(2));
        if(m1.checkb(2)<=1)
            s1=s1+"x"+m1.beverage[2];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(2)));
    }

    public void ChocolateAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(3));
        if(m1.checkb(3)<=1)
            s1=s1+"x"+m1.beverage[3];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(3)));
    }

    public void AppleAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(4));
        if(m1.checkb(4)<=1)
            s1=s1+"x"+m1.beverage[4];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(4)));
    }

    public void MacchiatoAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(5));
        if(m1.checkb(5)<=1)
            s1=s1+"x"+m1.beverage[5];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(5)));
    }

    public void LatteAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.beverag(6));
        if(m1.checkb(6)<=1)
            s1=s1+"x"+m1.beverage[6];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.beveragePric(6)));
    }

    //juice buttons
    public void OrangeAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.juic(0));
        if(m1.checkj(0)<=1)
            s1=s1+"x"+m1.juice[0];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.juicePric(0)));
    }

    public void MangoAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.juic(1));
        if(m1.checkj(1)<=1)
            s1=s1+"x"+m1.juice[1];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.juicePric(1)));
    }

    public void StrewberryAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.juic(2));
        if(m1.checkj(2)<=1)
            s1=s1+"x"+m1.juice[2];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.juicePric(2)));
    }
  //meals buttons

    public void ScrambledAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(0));
        if(m1.checkm(0)<=1)
            s1=s1+"x"+m1.meals[0];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(0)));
    }

    public void MixAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(1));
        if(m1.checkm(1)<=1)
            s1=s1+"x"+m1.meals[1];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(1)));
    }

    public void SausageAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(2));
        if(m1.checkm(2)<=1)
            s1=s1+"x"+m1.meals[2];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(2)));
    }

    public void SmokedAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(3));
        if(m1.checkm(3)<=1)
            s1=s1+"x"+m1.meals[3];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(3)));
    }

    public void MushroomAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(4));
        if(m1.checkm(4)<=1)
            s1=s1+"x"+m1.meals[4];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(4)));
    }

    public void LemonAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(5));
        if(m1.checkm(5)<=1)
            s1=s1+"x"+m1.meals[5];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(5)));
    }

    public void RoastAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(6));
        if(m1.checkm(6)<=1)
            s1=s1+"x"+m1.meals[6];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(6)));
    }

    public void TunaAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(7));
        if(m1.checkm(7)<=1)
            s1=s1+"x"+m1.meals[7];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(7)));
    }

    public void CeaserAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(8));
        if(m1.checkm(8)<=1)
            s1=s1+"x"+m1.meals[8];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(8)));
    }

    public void GreekAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(9));
        if(m1.checkm(9)<=1)
            s1=s1+"x"+m1.meals[9];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(9)));
    }

    public void NutellaAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(10));
        if(m1.checkm(10)<=1)
            s1=s1+"x"+m1.meals[10];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(10)));
    }

    public void WafflesAdd(ActionEvent actionEvent) {
        list.getItems().add(m1.meal(11));
        if(m1.checkm(11)<=1)
            s1=s1+"x"+m1.meals[11];
        Tprice.setText(String.valueOf(Order_Price=Integer.parseInt(Tprice.getText())+m1.mealsPric(11)));
    }


public static Stage stage6;
    public void OffersClicked(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("offers.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("offers");
        stage.setScene(scene);
        stage.show();
        stage6 = stage;
        if(OffersControll.stage4!=null)
            OffersControll.stage4.close();
        if(HotLineController.stage4!=null)
            HotLineController.stage4.close();
        if(ReservationController.stage4!=null)
           ReservationController.stage4.close();
    }
}
