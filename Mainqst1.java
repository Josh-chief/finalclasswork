package com.finalclasswork;

public class Mainqst1 {

    public static void main(String[] args) {
        Commodity c1 = new Commodity();
        // margin = selling_price - (buying_price+transport_cost) = -130
        // Here the constructor will run and create variables for the object called c1 and give
        // all the variables a value of zero

        // write your code here

        c1.get_data();

        /*System.out.println(c1.buying_price);
        System.out.println(c1.transport_cost);
        System.out.println(c1.selling_price); */

        // when we create a function we are telling intellij what will happen when the function runs. Here the function
        // has not yet run

        // when we call a function we are telling intellij to now run the function

        //c1.calculate();  // Here we have called the function by the name calculate

        c1.give_output();

        //System.out.println(c1.margin);

    }
}
