package com.example.ratatouille;

public class Offers extends Menu  implements IPrice{


    public final int minCharge  = 100 ;
     public final int minDiscount = 450;

    //method to calculate the price for  from menu
    //implement interface method
    public Double Price (Double price){
        if(price < minDiscount){
            return price;
        }
      return (price - price*0.15) ;
    }


    public Boolean checkMin (int N){
        if (N < minCharge){
            return false;
        }
        return true;
    }




}
