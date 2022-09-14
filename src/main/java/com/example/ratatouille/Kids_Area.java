package com.example.ratatouille;

public class Kids_Area implements IEntertainment {



    private static final int basic = 12;
    public double Price_Kids=0;

    String activities [] = {"Write a Story","Make Ice Cream ","Have a Cartoon Day",
            "Bake Cupcakes","Face Painting","Puzzle Game","Play with Magnetic Tiles"};



    //Overriding OpenTime in IEntertainment
    public int OpenTime(){
        return 17;
    }

    //Method1
    public Double ActivityPrices (int i ) {


        Double Prices []= {11.0, 17.3, 9.4, 21.0, 13.1, 5.5, 6.2};


     return Prices[i] ;
    }

    //Method2
    Double NumOfKids (int n  ){
        return n*basic*1.0 ;
    }


}
