package com.example.ratatouille;

public class Review extends Menu{

    //singelton Pattern
    static private Review rv1;
    private Review(){}

    public static Review getInstance()
    {
        if(rv1==null)
            rv1=new Review();

        return rv1;
    }

    String s;
    String[] suborder;

    public String message(double i)
    {

        if (i <=1)
            s = "20%: We're really sorry for that";
        else if (i <= 2)
            s = "40%: Give us another chance";
        else if (i <= 3)
            s = "60%: Promise you to be better";
        else if (i <= 4)
            s = "80%: It was an honour to serve you";
        else
            s = "100%: We're happy for your satisfaction";

        return s;
    }

    public int orders(String order)
    {
        suborder = order.split("x");

        for (int i = 0; i < suborder.length; i++)
        {
            suborder[i]=suborder[i].substring(0,suborder[i].length()-1);
        }

        return suborder.length;
    }
    public String orders( int j)
    {

        return suborder[j];
    }

}
