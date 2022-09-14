package com.example.ratatouille;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.DecimalFormat;

public class ReceiptControl {

    public  Label KidsPrice;
    public Label PetsPrice;
    public Label OrderPrice;
    public Label Taxs;
    public Label Service;
    public Label TotalPrice;
    public Label Loyalty;
    public Label the_order;
    public static String order="";
    public ImageView LoyaltyCardImage;

    Receipt R1 = new Receipt();
      public int  Pets = 20;

      DecimalFormat df= new DecimalFormat(".##");
    @FXML


    public void initialize()
    {
        LoyaltyCardImage.setVisible(false);
        int f=0;
        for(int i=0 ; i<MenuController.m1.jui(); i++)
        {
            f=MenuController.m1.checkj(i);
            if(f!=0)
            {

                order=order+f+"x"+MenuController.m1.juic(i)+"  ";
            }

        }

        for(int i=0 ; i<MenuController.m1.mea(); i++)
        {
            f=MenuController.m1.checkm(i);
            if(f!=0)
            {
                order=order+f+"x"+MenuController.m1.meal(i)+"  ";
            }

        }

        for(int i=0 ; i<MenuController.m1.bev(); i++)
        {
            f=MenuController.m1.checkb(i);
            if(f!=0)
            {
                order=order+f+"x"+MenuController.m1.beverag(i)+"  ";
            }

        }

        the_order.setText(order);
        //Kids label
        KidsPrice.setText(df.format(KidsController.K1.Price_Kids)) ;

        //Kids label
       if(KidsController.flag== 1)
       {
           PetsPrice.setText(String.valueOf(Pets)) ;
       }
       else {
           Pets = 0;
           PetsPrice.setText(String.valueOf(Pets)) ;
       }


       //Order label
       OrderPrice.setText(df.format(MenuController.Order_Price)) ;

       // Taxs label
        Taxs.setText(String.valueOf(R1.Tax*100));

        //Service label
        Service.setText(String.valueOf(R1.Fix));

        //Total Price label
        TotalPrice.setText(df.format(R1.Price((KidsController.K1.Price_Kids + Pets + MenuController.Order_Price + R1.Fix)*(1+R1.Tax))));

        //Data Base
        if (R1.Price((KidsController.K1.Price_Kids + Pets + MenuController.Order_Price + R1.Fix)*(1+R1.Tax))==0.0){
            Loyalty.setText("Congratulations!! your 10th Order is for Free!");
            LoyaltyCardImage.setVisible(true);

        }



    }
    public static Stage stage8; // stage of Review
    public void ReviewClicked(ActionEvent actionEvent) throws IOException {


            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ReviewInterface.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setTitle("Review");
            stage.setScene(scene);
            stage.show();
            stage8 = stage;
            OffersControll.stage7.close();

        }

}
