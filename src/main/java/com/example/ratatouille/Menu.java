package com.example.ratatouille;

public class Menu {


    public int[] b = new int[7];
    public int[] m = new int [12];
    public int[] j = new int [3];
// arrays for the number of times the item being choosed in the menu form


    public void initialize()
    {
        //aarays = 0 each time enterd menuController;
         for (int i=0 ; i<7 ; i++)
             b[i]=0;

        for (int i=0 ; i<12 ; i++)
            m[i]=0;

        for (int i=0 ; i<3 ; i++)
            j[i]=0;


    }
    public String[] beverage = { "Mocha", "Espresso", "Tea", "Hot Chocolate", "Hot Apple Cider", "Macchiato", "Latte" };
    public String beverag(int i) // method to return the name to appear in the list box, and to increment the counter of the choosed item
    {
        b[i]++;
        return beverage[i];
    }

    public int beveragePric(int i)
    {

        int[] beveragePrice = { 35, 22, 17, 28, 28, 22, 35 };

        return beveragePrice[i];
    }

    public String[] meals = { "Scrambled Eggs", "MIX Cheese", "Sausage Sandwich", "Smoked Salmon", "Chicken Mushroom",
            "Lemon Chicken", "Roast Beef", "Tuna", "Caesar Salad", "Greek Salad", "Nutella Pancakes", "Waffle" };

    public String meal(int i)  // method to return the name to appear in the list box, and to increment the counter of the choosed item
    {

        m[i]++;
        return meals[i];
    }
    public int mealsPric(int i)
    {
        int[] mealsPrice = { 22, 55, 72, 88, 61, 66, 72, 55, 54, 48, 44, 28 };
        return mealsPrice[i];
    }

    public String[] juice = { "Orange", "Mango", "Strawberry" };
    public String juic(int i)  // method to return the name to appear in the list box, and to increment the counter of the choosed item
    {

        j[i]++;
        return juice[i];
    }

    public int juicePric(int i)
    {
        int[] juicePrice = { 22, 28, 26 };
        return juicePrice[i];
    }



    public int bev() //return the number of Bevarge in menu
    {
        return 7;
    }
    public int mea()//return the number of Meals in menu
    {
        return 12;
    }
    public int jui()//return the number of juice in menu
    {
        return 3;
    }
    public int checkb(int i) //check the number of times this item being choosed
    {
        return b[i];
    }

    public int checkm(int i)//check the number of times this item being choosed
    {

        return m[i];
    }
    public int checkj(int i)//check the number of times this item being choosed
    {
        return j[i];
    }



}

